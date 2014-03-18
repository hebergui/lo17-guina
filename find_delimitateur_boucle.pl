#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;

#shebang inutile : lancer avec la commande : perl [*.pl]
#Ex. : perl find_delimitateur_boucle.pl


sub COUNT_BALISE {
	my $count = 0;

	my $pwd = `pwd`;
	chomp $pwd;
	my $file_in = $pwd . "/LCI_oneline/" . $_[0];
	
	my $reg = $_[1];

	open(my $f_in, "$file_in") or die "Impossible d'ouvrir en lecture $file_in\n";
	while(<$f_in>)
	{
		if( m/(IBL_ID=$reg|Blc=$reg)(.*?)(IBL_ID=$reg|\/Blc=$reg)/ )
		{
			if(defined $_[2])
			{
				my $reg2 = $_[2];
				if( $2 =~ m/$reg2/)
				{
					$count++;
				}
			}
			else
			{
				$count++;
			}
		}
	}
	print	"count balise : $count \n";
	return $count;
}

sub COUNT_REGEXP {
	my $count = 0;

	my $pwd = `pwd`;
	chomp $pwd;
	my $file_in = $pwd . "/LCI_rubrique/" . $_[0];

	my $regexp = $_[1];
	my $ligne_rubrique = $_[2];

	open(my $f_in, "$file_in") or die "Impossible d'ouvrir en lecture $file_in\n";
	my $ligne = 1;

	while(<$f_in>)
	{
		if ($ligne == $ligne_rubrique ) {
			if ( $regexp ) {
				#print "$2\n";
				$count++;
		}
		}
		$ligne++;
	}

	print	"count regexp : $count ";
	return $count;
}

system("clear");
print "*** Script : vérification de l'unicite/exhaustivite de la regexp sur tout un répertoire ***\n";

print "Liste des rubriques : \n";
print "\t[U]NE\n";
print "\t[V]OIRAUSSI\n";
print "\t[F]OCUS\n";
print "\t[G]ROSTITRES\n";
print "\t[R]APPELS\n";
print "\t\tChoix > ";
my $choix = <>;
chomp $choix;

my $regexp;
my $reg_balise1;
my $reg_balise2;
my $ligne_rubrique;

if (uc($choix) eq 'U') {
	$regexp = quotemeta "m/<a\sclass=\"S2\"\shref=\"(.+)\">Lire l'article<\/a>/";
	$reg_balise1 = "27914";
	$ligne_rubrique = 1;
}
elsif (uc($choix) eq 'V') {
	$regexp = quotemeta "m/<a\shref.+?(\/news.*?\.html).+?class=\"S48\">(.+?)<\/a>/g";
	$reg_balise1 = "27914";
	$reg_balise2 = "S301";
	$ligne_rubrique = 2;
}
elsif (uc($choix) eq 'F') {
	$regexp = "27913";
}
elsif (uc($choix) eq 'G') {
	$regexp = "27915";
}
elsif (uc($choix) eq 'R') {
	$regexp = "27916";
}
else {
	die "Aucune lettre ne correspond avec les catégories !\n";
}


my $pwd = `pwd`;
chomp $pwd;
my $directory_in = $pwd . "/LCI_rubrique/";

opendir(my $d_in, $directory_in) or die "Impossible d'ouvrir le répertoire $directory_in\n";
my $count_loop = 0;

my $count1 = 0;
my $count2 = 0;

while(readdir($d_in))
{
	if ($_ ne ".." && $_ ne ".") {
		my $file = $_;

		#system("perl find_delimitateur.pl $_ $regexp loop");
		$count2 = &COUNT_REGEXP($file, $regexp, $ligne_rubrique);
		
		if(defined $reg_balise2)
		{
			#system("perl rubriques.pl $_ loop $reg_balise1 $reg_balise2");
			$count1 = &COUNT_BALISE($file, $reg_balise1, $reg_balise2 );
		}
		else
		{
			#system("perl rubriques.pl $_ loop $regexp");
			$count1 = &COUNT_BALISE($file, $reg_balise1 );
		}

		#my $diff = $count1-$count2;
		#print "la regexp $regexp n'a pas identifie $diff balises" if($diff && $count1);
		
		$count_loop++;
	}
}

my $count_files = `ls -Al $directory_in | wc -l`;
chomp $count_files;

print "\nLe script a traité $count_loop fichiers (sur $count_files)\n";


