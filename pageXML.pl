#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;
use Switch;

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] [mode]
#Ex. page avec toutes les rubriques : 			perl pageXML.pl lci-monde-2005-02-25.html 
#Ex. page où il manque rubrique voir_aussi :	perl pageXML.pl lci-monde-2005-10-26.html

sub urlArticle {
	my $f_out = $_[0];
	my $l = $_[1];

	print $f_out "\t\t\t<urlArticle>";
	if( $l =~ m/class="S431"(.+)">/ )
		{
			if ( $1 =~ m/<a class="S2" href="(.+)">Lire l'article<\/a>/ ) {
				print $f_out "$1\n";
			}
		}
	print $f_out "\t\t\t</urlArticle>";
}

sub titreArticle {
	my $f_out = $_[0];
	my $l = $_[1];

	print $f_out "\t\t\t<titreArticle>";
	
	if( $l =~ m/class="S431"(.+?)>(.+?)<\/a>/ )
		{
			print $f_out $2;
		}
	print $f_out "\t\t\t</titreArticle>";
}

sub urlImage {
	my $f_out = $_[0];
	my $l = $_[1];

	print $f_out "\t\t\t<urlImage>";
	
	if( $l =~ m/class="S431".+<img src="(http.+?)"/ )
		{
			print $f_out $1;
		}
	print $f_out "\t\t\t</urlImage>";
}

sub resumeArticle {
	my $f_out = $_[0];
	my $l = $_[1];

	print $f_out "\t\t\t<resumeArticle>";
	
	my @matches = ( $l =~ m/\/img\/news\/puce_rouge\.gif.+>(.+?)<\/a>/ );
	foreach my $match (@matches) {
   		print "$match\n";
	}
	print $f_out "\t\t\t</resumeArticle>";
}

system("clear");
print "*** Script 2.x.x : Mise en format xml ***\n";

my $pwd = `pwd`;
chomp $pwd;

my $file_in = $pwd . "/LCI_rubrique/" . $ARGV[0];
my $directory_out = $pwd . "/LCI_xml/";
my $file_out;
my $date;

if ( $ARGV[0] =~ m/(lci\-monde\-(.+))\.(.*$)/ ) {
	$file_out = $directory_out . $1 . ".xml";
	$date = $2;
}
else {
	die "$ARGV[0] est un mauvais nom de fichier !";
}

open(my $f_in, "<", $file_in) or die "Impossible d'ouvrir en lecture $file_in\n";
mkdir($directory_out);
open(my $f_out, ">$file_out") or die "Impossible d'ouvrir en écriture $file_out\n";

$date =~ m/(.+)-(.+)-(.+)/;
$date = $3 . "/" . $2 . "/" . $1;

print $f_out "\t<PAGE_LCI>\n";
print $f_out "\t\t<FICHIER>$ARGV[0]</FICHIER>\n";
print $f_out "\t\t<DATE_PAGE>$date</DATE_PAGE>\n";

my $ligne = 1;

while ( <$f_in> ) {

	switch ($ligne) {
		case 1 {
			print $f_out "\t\t<UNE>\n";
			&urlArticle($f_out, $_);
			&titreArticle($f_out, $_);
			print $f_out "\t\t<dateArticle>$date</dateArticle>\n";
			&urlImage($f_out, $_);
			&resumeArticle($f_out, $_);
			print $f_out "\t\t</UNE>\n";
		}
		case 2 {
			print $f_out "\t\t<LES_VOIRAUSSI>\n";	
			print $f_out "\t\t\t<VOIRAUSSI>\n";	
			print $f_out "\t\t\t</VOIRAUSSI>\n";
			print $f_out "\t\t</LES_VOIRAUSSI>\n";
		}
		case 3 {
			print $f_out "\t\t<FOCUS>\n";	
			print $f_out "\t\t</FOCUS>\n";
		}
		case 4 {
			print $f_out "\t\t<LES_GROSTITRES>\n";	
			print $f_out "\t\t</LES_GROSTITRES>\n";
		}
		case 5 {
			print $f_out "\t\t<LES_RAPPELS>\n";	
			print $f_out "\t\t</LES_RAPPELS>\n";
		}
		else {
			die "Erreur, il y a un problème de ligne dans le fichier !\n";
		}
	}

	$ligne++;
}

print $f_out "\t</PAGE_LCI>\n";	

close($f_in);
close($f_out);