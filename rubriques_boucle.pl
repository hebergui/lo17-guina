#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] [mode]
#Ex. : perl rubriques_boucle.pl 

system("clear");
print "*** Script 2.2.1 : vérification de l'opération sur tout un répertoire ***\n";

print "Liste des rubriques : \n";
print "\t[U]NE\n";
print "\t[V]OIRAUSSI\n";
print "\t[F]OCUS\n";
print "\t[G]ROSTITRES\n";
print "\t[R]APPELS\n";
print "\t\tChoix > ";
my $choix = <>;
chomp $choix;

my $reg1;
my $reg2;

if (uc($choix) eq 'U') {
	$reg1 = "27914";
}
elsif (uc($choix) eq 'V') {
	$reg1 = "27914";
	$reg2 = "S301";
}
elsif (uc($choix) eq 'F') {
	$reg1 = "27913";
}
elsif (uc($choix) eq 'G') {
	$reg1 = "27915";
}
elsif (uc($choix) eq 'R') {
	$reg1 = "27916";
}
else {
	die "Aucune lettre ne correspond avec les catégories !\n";
}


my $pwd = `pwd`;
chomp $pwd;
my $directory_in = $pwd . "/LCI_rubrique/";

opendir(my $d_in, $directory_in) or die "Impossible d'ouvrir le répertoire $directory_in\n";
my $count_loop = 0;

while(readdir($d_in))
{
	if ($_ ne ".." && $_ ne ".") {
		if(defined $reg2)
		{
			system("perl rubriques.pl $_ loop $reg1 $reg2");
		}
		else
		{
			system("perl rubriques.pl $_ loop $reg1");
		}
		$count_loop++;
	}
}

my $count_files = `ls -Al $directory_in | wc -l`;
chomp $count_files;

print "\nLe script a traité $count_loop fichiers (sur $count_files)\n";


