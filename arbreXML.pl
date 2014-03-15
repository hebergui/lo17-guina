#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] [mode]
#Ex. : perl arbreXML.pl

my $pwd = `pwd`;
chomp $pwd;

my $directory_in = $pwd . "/LCI_rubrique/";
opendir(my $d_in, $directory_in) or die "Impossible d'ouvrir le répertoire $directory_in\n";

my $file_out = $pwd . "/arbreXML.xml";
open(my $f_out, ">$file_out") or die "Impossible de creer le fichier $file_out\n";

my $count_loop = 0;

print $f_out "<CORPUS>\n";
while(readdir($d_in))
{
	if ($_ ne ".." && $_ ne ".") 
	{
		my $file_in = $directory_in . $_;

		open(my $f_in, "$file_in") or die "Impossible d'ouvrir en lecture $file_in\n";

		while ( <$f_in> ) {

			print $f_out "\t<PAGE_LCI>\n";
			print $f_out "\t\t<FICHIER></FICHIER>\n";
			print $f_out "\t\t<DATE_PAGE></DATE_PAGE>\n";

			#separation selon \n (marche pas je sais pas pourquoi !)
			if ( $f_in =~ m/(.+)\n(.+)/ ) 
			{
				print $f_out "\t\t<UNE>\n";	
				print $f_out "\t\t</UNE>\n";
				print $f_out "\t\t<LES_VOIRAUSSI>\n";	
				print $f_out "\t\t</LES_VOIRAUSSI>\n";
				print $f_out "\t\t\t<VOIRAUSSI>\n";	
				print $f_out "\t\t\t</VOIRAUSSI>\n";
				print $f_out "\t\t<FOCUS>\n";	
				print $f_out "\t\t</FOCUS>\n";
				print $f_out "\t\t<LES_GROSTITRES>\n";	
				print $f_out "\t\t</LES_GROSTITRES>\n";
				print $f_out "\t\t<LES_RAPPELS>\n";	
				print $f_out "\t\t</LES_RAPPELS>\n";		
			}

			print $f_out "\t<PAGE_LCI>\n";	
		}

		close($f_in);
		$count_loop++;
	}
}

print $f_out "</CORPUS>\n";
close($f_out);

my $count_files = `ls -Al $directory_in | wc -l`;
chomp $count_files;

print "\nLe script a traité $count_loop fichiers (sur $count_files)\n";

