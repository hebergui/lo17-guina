#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] [mode]
#Ex. : perl find_delimitateur.pl lci-monde-2005-02-25.html

if ( not defined $ARGV[1] ) {
	system("clear");
	print "*** Script : Vérification du nombre d'aparition du délimitateur rentré en argument et voir si ça marche bien ***\n";
}

my $pwd = `pwd`;
chomp $pwd;

my $file_in = $pwd . "/LCI_rubrique/" . $ARGV[0];

open(my $f_in, "$file_in") or die "Impossible d'ouvrir en lecture $file_in\n";
my $count = 0;
my $ligne = 0;

while(<$f_in>)
{
	if ($ligne == 0 ) {
			if ( m/class="S431"(.+?)<img src="(http.+?)"/ ) {
				#print "$2\n";
				$count++;
		}
	}
}

print "[ligne $ligne] Balise non trouvée dans $file_in \n" if($count==0);
#print "[ligne $ligne] Balise trouvée $count fois dans $file_in \n" if($count>0);

close($f_in);

