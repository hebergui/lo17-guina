#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;
use utf8; #pour les erreurs de type "Data outside latin1 range (pos=xxx, ch=U+xxx)"

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] [mode] [délimitateur1] ([délimitateur2])
#Ex. : perl ligne_rubrique.pl lci-monde-2005-02-25.html loop 27914 S301

if ( not defined $ARGV[1] ) {
	system("clear");
	print "*** Script 2.3.1 : Ecriture du contenu délimité par le(s) délimitateur(s) rentrés en paramètre(s) ***\n";
}

my $pwd = `pwd`;
chomp $pwd;

my $file_in = $pwd . "/LCI_oneline/" . $ARGV[0];
my $directory_out = $pwd . "/LCI_rubrique/";
my $file_out = $directory_out . $ARGV[0];
my $reg = $ARGV[2];

open(my $f_in, "$file_in") or die "Impossible d'ouvrir en lecture $file_in\n";
mkdir($directory_out);
open(my $f_out, ">>$file_out") or die "Impossible d'ouvrir en ajout $file_out\n";

while(<$f_in>)
{
	if( m/(IBL_ID=$reg(.*?)-->|Blc=$reg(.*?)-->)(.*?)(<!--(.*?)IBL_ID=$reg|<!--(.*?)\/Blc=$reg)/ )
	{
		if(defined $ARGV[3])
		{
			my $reg2 = $ARGV[3];
			my $text = $4;
			if( $4 =~ m/$reg2">(.+)span/)
			{
				print $f_out $1;
			}
		}
		else
		{
			print $f_out $4;
		}
		print $f_out "\n";
	}
}


close($f_in);
close($f_out);
