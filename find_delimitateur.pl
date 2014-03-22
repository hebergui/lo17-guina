#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;
use utf8; #pour les erreurs de type "Data outside latin1 range (pos=xxx, ch=U+xxx)"

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] [mode] [délimitateur1] ([délimitateur2])
#Ex. : perl find_delimitateur.pl lci-monde-2005-02-25.html voir_aussi loop 27914 S301

if ( not defined $ARGV[1] ) {
	system("clear");
	print "*** Script 2.3.1 : Recherche du contenu délimité par le(s) délimitateur(s) rentrés en paramètre(s) ***\n";
}

my $pwd = `pwd`;
chomp $pwd;

my $file_in = $pwd . "/LCI_oneline/" . $ARGV[0];
my $reg = $ARGV[3];

open(my $f_in, "$file_in") or die "Impossible d'ouvrir en lecture $file_in\n";
my $count = 0;

while(<$f_in>)
{
	if( m/(IBL_ID=$reg|Blc=$reg)(.*?)(IBL_ID=$reg|\/Blc=$reg)/ )
	{
		if(defined $ARGV[4])
		{
			my $reg2 = $ARGV[4];
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


if($count!=1)
{
	print "Balise non trouvée dans $file_in \n";

	my $f_log;
	open($f_log, ">>","log/id_rubrique/".$ARGV[2]) or die "Impossible d'ouvrir en lecture log/id_rubrique/$ARGV[2] \n";
	print $f_log "$count dans $file_in \n";
}

#print "count = $count";
#print "Balise trouvée $count fois dans $file_in \n" if($count>0);

close($f_in);

