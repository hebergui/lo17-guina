#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;
use Unicode::String qw(utf8 latin1); # si erreur : sudo apt-get install libunicode-string-perl (sous Ubuntu)
use utf8; #pour les erreurs de type "Data outside latin1 range (pos=xxx, ch=U+xxx)"

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] [mode] 
#Ex. : perl rubriques.pl lci-monde-2005-02-25.html 

if ( not defined $ARGV[1] ) {
	system("clear");
	print "*** Script 2.1.1 : vérifier qu'une page LCI contient bien les expressions données dans l'énoncé ***\n";
}

# spécifie le format par défaut des chaînes en entrée
Unicode::String->stringify_as('utf8');

my $pwd = `pwd`;
chomp $pwd;

my $file_in = $pwd . "/LCI_oneline/" . $ARGV[0];
my $file_out = $pwd . "/LCI_rubrique/" . $ARGV[0];
my $reg = $ARGV[2];

open(my $f_in, "$file_in") or die "Impossible d'ouvrir en lecture $file_in\n";
open(my $f_out, ">>$file_out") or die "Impossible d'ouvrir en ajout $file_out\n";


# MARCHE PAS POUR BLC
while(<$f_in>)
{
	if( m/(IBL_ID=$reg(.*?)-->|Blc=$reg(.*?)-->)(.*?)(<!--(.*?)IBL_ID=$reg|<!--(.*?)\/Blc=$reg)/ )
	{
		if(defined $ARGV[3])
		{
			my $reg2 = $ARGV[3];
			my $text = $4;
			if( $4 =~ m/$reg2/)
			{
				print $f_out $text;
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
