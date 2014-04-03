#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] [mode]
#Ex. : perl oneline_boucle.pl

system("clear");
print "*** Script 2.2.2 : répétition de l'opération sur tout un répertoire (/LCI_normalise -> /LCI_oneline) ***\n";

my $pwd = `pwd`;
chomp $pwd;
my $directory_in = $pwd . "/LCI_normalise/";

opendir(my $d_in, $directory_in) or die "Impossible d'ouvrir le répertoire $directory_in\n";
my $count_loop = 0;

while(readdir($d_in))
{
	if ($_ ne ".." && $_ ne ".") {
		system("perl oneline.pl $_ loop");
		print ".";
		$count_loop++;
	}
}

my $count_files = `ls -A $directory_in | wc -l`;
chomp $count_files;

print "\nLe script a traité $count_loop fichiers (sur $count_files)\n";