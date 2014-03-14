#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;

#shebang inutile : lancer avec la commande : perl [*.pl] [dossier] ([mode])
#Ex. : perl ligne_rubrique_boucle.pl LCI_oneline/

system("clear");
print "*** Script 2.1.4 : répétition de l'opération sur tout un répertoire (/LCI_oneline -> /LCI_rubrique) ***\n";

my $pwd = `pwd`;
chomp $pwd;
my $directory_in = $pwd . "/LCI_oneline/";
my $directory_out = "/LCI_rubrique/";

opendir(my $d_in, $directory_in) or die "Impossible d'ouvrir le répertoire $directory_in\n";
my $count_loop = 0;

while(readdir($d_in))
{
	if ($_ ne ".." && $_ ne ".") {
		
		#my $file_out = $pwd . $directory_out . $_;
		#open(my $f_out, ">$file_out") or die "Impossible de creer le fichier $file_out\n $!";
		
		system("perl ligne_rubrique.pl $_ loop 27914"); #UNE
		system("perl ligne_rubrique.pl $_ loop 27914 S301"); #LES_VOIRAUSSI
		system("perl ligne_rubrique.pl $_ loop 27913"); #FOCUS
		system("perl ligne_rubrique.pl $_ loop 27915"); #LES_GROSTITRES
		system("perl ligne_rubrique.pl $_ loop 27916"); #LES_RAPPELS
		$count_loop++;
	}
}

my $count_files = `ls -Al $directory_in | wc -l`;
chomp $count_files;

print "\nLe script a traité $count_loop fichiers (sur $count_files)\n";


