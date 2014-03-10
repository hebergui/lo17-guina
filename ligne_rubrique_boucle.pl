#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] [mode]
#Ex. : perl verification-boucle.pl LCI/

system("clear");
print "*** Script 2.1.4 : répétition de l'opération sur tout un répertoire ***\n";

my $pwd = `pwd`;
chomp $pwd;
my $directory_in = $pwd . "/" . $ARGV[0] . "/";

my $directory_out = "/LCI_rubrique/";
mkdir($pwd . $directory_out);

opendir(my $d_in, $directory_in) or die "Impossible d'ouvrir le répertoire $directory_in\n";
my $count_loop = 0;

while(readdir($d_in))
{
	if ($_ ne ".." && $_ ne ".") {
		
		my $file_out = $pwd . $directory_out . $_;
		open(my $f_out, ">$file_out") or die "Impossible de creer le fichier $file_out\n $!";
	
		#if($ARGV[2])
		#{
			#system("perl ligne_rubrique.pl $_ loop $ARGV[1] $ARGV[2]");
		#}
		#else
		#{
		#	#system("perl ligne_rubrique.pl $_ loop $ARGV[1]");
		#}

		system("perl ligne_rubrique.pl $_ loop 27914");
		system("perl ligne_rubrique.pl $_ loop 27914 S301");
		system("perl ligne_rubrique.pl $_ loop 27913");
		system("perl ligne_rubrique.pl $_ loop 27915");
		system("perl ligne_rubrique.pl $_ loop 27916");
		$count_loop++;
	}
}

my $count_files = `ls -Al $directory_in | wc -l`;
chomp $count_files;

print "\nLe script a traité $count_loop fichiers (sur $count_files)\n";


