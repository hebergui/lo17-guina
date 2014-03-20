#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;

#shebang inutile : lancer avec la commande : perl [*.pl]
#Ex. : perl pageXML_boucle.pl

system("clear");
print "*** Script 2.2.4 : répétition de l'opération sur tout un répertoire (/LCI_rubrique -> /LCI_xml) ***\n";

my $pwd = `pwd`;
chomp $pwd;
my $directory_in = $pwd . "/LCI_rubrique/";

opendir(my $d_in, $directory_in) or die "Impossible d'ouvrir le répertoire $directory_in\n";
my $count_loop = 0;

while(readdir($d_in))
{
	if ($_ ne ".." && $_ ne ".") {
		print "$_ ";
		system("perl pageXML.pl $_ loop");
		print "\n";
		#print ".";
		$count_loop++;
	}
}

my $count_files = `ls -Al $directory_in | wc -l`;
chomp $count_files;

print "\nLe script a traité $count_loop fichiers (sur $count_files)\n";


