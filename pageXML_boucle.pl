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

#creation/troncage des fichiers de log (1 par rubrique)
my $f_log;
open($f_log, "+>","log/id_partie/une") or die "Impossible de creer/tronquer log/id_partie/une\n";
print $f_log "***Liste des problemes releves pour les differentes regexp utilisees***\n\n";
open($f_log, "+>","log/id_partie/voir_aussi") or die "Impossible de creer/tronquer log/id_partie/voir_aussi\n";
print $f_log "***Liste des problemes releves pour les differentes regexp utilisees***\n\n";
open($f_log, "+>","log/id_partie/focus") or die "Impossible de creer/tronquer log/id_partie/focus\n";
print $f_log "***Liste des problemes releves pour les differentes regexp utilisees***\n\n";
open($f_log, "+>","log/id_partie/gros_titre") or die "Impossible de creer/tronquer log/id_partie/gros_titre\n";
print $f_log "***Liste des problemes releves pour les differentes regexp utilisees***\n\n";
open($f_log, "+>","log/id_partie/rappel") or die "Impossible de creer/tronquer log/id_partie/rappel\n";
print $f_log "***Liste des problemes releves pour les differentes regexp utilisees***\n\n";

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


