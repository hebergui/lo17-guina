#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;

#shebang inutile : lancer avec la commande : perl [*.pl]
#Ex. : perl fichierXML.pl

system("clear");

print "Executer le script pageXML_boucle.pl avant [o/n] ? ";
my $choix = <STDIN>;
chomp $choix;

if (uc($choix) eq 'O') {
	system("perl pageXML_boucle.pl");
}

print "*** Script 2.2.4 : Création d'un arbre xml ***\n";
print "Appuyer sur une touche pour commencer... ";
<STDIN>;

my $pwd = `pwd`;
chomp $pwd;
my $directory_in = $pwd . "/LCI_xml/";

opendir(my $d_in, $directory_in) or die "Impossible d'ouvrir le répertoire $directory_in\n";
my $count_loop = 0;

my $file_out = "FICHIER.xml";
open(my $f_out, ">$file_out") or die "Impossible d'ouvrir en écriture $file_out\n";

print $f_out "<CORPUS>\n";

while(readdir($d_in))
{
	if ($_ ne ".." && $_ ne ".") {
		print "$_ \n";
		open(my $f_in, "<", $directory_in . $_) or die "Impossible d'ouvrir en lecture $_\n";
		while ( <$f_in> ) {
			print $f_out $_;
		}
		$count_loop++;
	}
}

print $f_out "</CORPUS>";

my $count_files = `ls -Al $directory_in | wc -l`;
chomp $count_files;

print "\nLe script a traité $count_loop fichiers (sur $count_files)\n";


