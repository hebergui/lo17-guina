#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] [mode]
#Ex. : perl oneline.pl lci-monde-2005-02-25.html

if ( not defined $ARGV[1] ) {
	system("clear");
	print "*** Script 2.2.1 : met sur une seule ligne un fichier ***\n";
}

my $pwd = `pwd`;
chomp $pwd;

my $file_in = $pwd . "/LCI_normalise/" . $ARGV[0];
my $file_out;
my $directory_name = "/LCI_oneline/";

if ( $ARGV[0] =~ m/(.+?)\.(.*$)/ ) {
	#si l'on veut changer le nom du fichier
	#$file_out = $pwd . "/LCI_tmp/" . $1 . "_copie." . $2 ;
	$file_out = $pwd . $directory_name . $1 . "." . $2 ;
}
else {
	die "$ARGV[0] est un mauvais nom de fichier !";
}

open(my $f_in, "$file_in") or die "Impossible d'ouvrir en lecture $file_in\n";
mkdir($pwd . $directory_name);
open(my $f_out, ">", $file_out) or die "Impossible d'ouvrir en écriture $file_out\n";

while ( <$f_in> ) {
	$_ =~ s/\n//;
	$_ =~ s/\r//;
	$_ =~ s/\lf//;

	print $f_out $_;
}

close($f_in);
close($f_out);

if ( not defined $ARGV[1] ) {
	my $l_in = `wc $file_in`;
	my $l_out = `wc $file_out`;
	
	$l_in =~ m/ +(.+?) +(.+?) /;
	print "Fichier d'entrée : $1 lignes et $2 mots \n";
	$l_out =~ m/ +(.+?) +(.+?) /;
	print "Fichier de sortie : $1 lignes et $2 mots \n";

	print "Ouvrir les deux pages htlm pour controler [o/n] ? ";
	my $choix = <stdin>;
	chomp $choix;
	$choix = uc $choix;

	if ($choix eq "o") {
		print "Ouverture des deux pages html sous Firefox pour voir la différence...\n";
		exec("firefox $file_in $file_out &") or die "Impossible d'ouvrir les pages htlm avec firefox\n";
	}
}