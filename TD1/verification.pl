#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;
use Unicode::String qw(utf8 latin1); # si erreur : sudo apt-get install libunicode-string-perl (sous Ubuntu)
use utf8; #pour les erreurs de type "Data outside latin1 range (pos=xxx, ch=U+xxx)"

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] ( [mode] )
#Ex. : perl verification.pl lci-monde-2005-02-25.html

if ( not defined $ARGV[1] ) {
	system("clear");
	print "*** Script 2.1.1 : vérifier qu'une page LCI contient bien les expressions données dans l'énoncé ***\n";
}

# spécifie le format par défaut des chaînes en entrée
Unicode::String->stringify_as('utf8');

my $pwd = `pwd`;
chomp $pwd;

my $file_in = $pwd . "/LCI/" . $ARGV[0];
my $file_out;
my $directory_out = "/LCI_normalise/";

if ( $ARGV[0] =~ m/(.+?)\.(.*$)/ ) {
	#si l'on veut changer le nom du fichier
	#$file_out = $pwd . "/LCI_tmp/" . $1 . "_copie." . $2 ;
	$file_out = $pwd . $directory_out . $1 . "." . $2 ;
}
else {
	die "$ARGV[0] est un mauvais nom de fichier !";
}

open(my $f_in, "$file_in") or die "Impossible d'ouvrir en lecture $file_in\n";
mkdir($pwd . $directory_out);
open(my $f_out, ">", $file_out) or die "Impossible d'ouvrir en écriture $file_out\n";
my $count = 0;

while( <$f_in> ) {
	if ( /IBL_ID=27303/ || /Blc=27303/ ) {
		do {
			# convertir la ligne DOCTYPE .. UTF-8 en DOCTYPE .. iso8859-1
			(/DOCTYPE HTML/) && (s/[Uu][Tt][Ff]\-8/iso8859-1/);

			#pour les erreurs de type "Data outside latin1 range (pos=xxx, ch=U+xxx)"
			#convert characters beyond 0xFF to their numeric character entity equivalent before passing the data to Unicode::String
			$_ =~ s/([\x{80}-\x{FFFF}])/'&#' . ord($1) . ';'/gse;
			my $u = Unicode::String->new($_);

			# rendre la chaîne sous un format iso8859-1
			print $f_out $u->latin1;
			$_ = <$f_in>;
			
		} until ( /IBL_ID=27916 - Temps/ || /Blc=27916, [0-9]/ );

		(/DOCTYPE HTML/) && (s/[Uu][Tt][Ff]\-8/iso8859-1/);
		$_ =~ s/([\x{80}-\x{FFFF}])/'&#' . ord($1) . ';'/gse;
		my $u = Unicode::String->new($_);
		print $f_out $u->latin1;
		$_ = <$f_in>;
	}
}

close($f_in);
close($f_out);

my $l_in = `wc -l $file_in`;
my $l_out = `wc -l $file_out`;
$l_in =~ m/^(.+?) /;
$l_in = $1;
$l_out =~ m/^(.+?) /;
$l_out = $1;

if ( not defined $ARGV[1] ) {
	print "Nombre de lignes du fichier d'entrée : $l_in\n";
	print "Nombre de lignes du fichier de sortie: $l_out\n";

	print "Ouvrir les deux pages htlm pour controler [o/n] ? ";
	my $choix = <stdin>;
	chomp $choix;
	$choix = uc $choix;

	if ($choix eq "o") {
		print "Ouverture des deux pages html sous Firefox pour voir la différence...\n";
		exec("firefox $file_in $file_out &") or die "Impossible d'ouvrir les pages htlm avec firefox\n";
	}
}
else {
	if ( $l_out == 0 ) {
		print "Aucun contenu dans le fichier $ARGV[0]\n";
	}
}


