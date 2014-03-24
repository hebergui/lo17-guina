#! /usr/bin/perl -w

#Script by (Guillaume Hébert & Nina Martin) - LO17 TD1 - UTC

use strict;
use warnings;
use Switch;

#shebang inutile : lancer avec la commande : perl [*.pl] [fichier] [mode]
#Ex. page avec toutes les rubriques : 			perl pageXML.pl lci-monde-2005-02-25.html 
#Ex. page où il manque rubrique voir_aussi :	perl pageXML.pl lci-monde-2005-10-26.html
#perl pageXML.pl lci-monde-2006-02-15.html

#################################### URL ########################################
sub UNE {
	my $f_out = $_[0];
	my $l = $_[1];
	my $date = $_[2];
	my $file_in = $_[3];
	my $count = 0;

	#ouverture fichier log
	my $f_log;
	open($f_log, ">>","log/id_partie/une") or die "Impossible d'ouvrir en lecture log/id_partie/une \n";

	############ urlArticle ############
	print $f_out "\t\t\t<urlArticle>";
	if( $l =~ m/class="S431"(.+)">/ ) {
		if ( $1 =~ m/<a class="S2" href="(.+)">Lire l'article<\/a>/ ) {
			print $f_out "$1";
		}
		else
		{
			print $f_log "regexp url non trouvee dans $file_in\n";
		}
	}
	print $f_out "</urlArticle>\n";

	############ titreArticle ############
	print $f_out "\t\t\t<titreArticle>";
	if( $l =~ m/class="S431"(.+?)>(.+?)<\/a>/ ) {
			print $f_out $2;
	}
	else
	{
		print $f_log "regexp titre non trouvee dans $file_in\n";
	}
	print $f_out "</titreArticle>\n";
	
	############ dateArticle ############
	print $f_out "\t\t\t<dateArticle>$date</dateArticle>\n";
	
	############ urlImage ############
	print $f_out "\t\t\t<urlImage>";
	if( $l =~ m/class="S431".+<img src="(http.+?)"/ ) {
		print $f_out $1;
	}
	else
	{
		print $f_log "regexp image non trouvee dans $file_in\n";
	}
	print $f_out "</urlImage>\n";

	############ resumeArticle ############
	print $f_out "\t\t\t<resumeArticle>";
	$count = 0;
	while ( $l =~ m/\/img\/news\/puce_rouge\.gif.+?>(.+?)<\/a>/g ) {
		print $f_out $1;
		$count ++;
	}
	print $f_log "regexp resume non trouvee dans $file_in\n" if($count==0);
	print $f_out "</resumeArticle>\n";

	############ mailto ############
	print $f_out "\t\t\t<mailto>";
	$count = 0;
	while ( $l =~ m/<a\shref="mailto:(.*?)".*?class="S14".+?<\/a>/g ) {
		print $f_out $1;
		$count++;
	}
	print $f_log "regexp mailto non trouvee dans $file_in\n" if($count==0);
	print $f_out "</mailto>\n";
}
##################################### * ##########################################

################################ VOIRAUSSI #######################################
sub VOIRAUSSI {
	my $f_out = $_[0];
	my $l = $_[1];
	my $file_in = $_[2];
	my $count = 0;

	#ouverture fichier log
	my $f_log;
	open($f_log, ">>","log/id_partie/voir_aussi") or die "Impossible d'ouvrir en lecture log/id_partie/voir_aussi \n";
	
	while ( $l =~ m/<a.*?href.+?(\/news.*?[\.html]?).*?class="S48">(.+?)<\/a>/g ) {
		print $f_out "\t\t\t<VOIRAUSSI>\n";
		my $url = $1;
		my $titre = $2;
		
		############ dateArticle ############
		if ( $2 =~ m/\(((.{2})\/(.{2})\/(.{4}))\)/ ) {
			print $f_out "\t\t\t\t<dateArticle>";
			print $f_out $1;
			print $f_out "</dateArticle>\n";
		}
		else
		{
			print $f_log "regexp date non trouvee dans $file_in\n";
		}
		

		############ urlArticle ############
		print $f_out "\t\t\t\t<urlArticle>";
		print $f_out $url;
		print $f_out "</urlArticle>\n";

		############ titreArticle ############
		print $f_out "\t\t\t\t<titreArticle>";
		print $f_out $titre;
		print $f_out "</titreArticle>\n";

		print $f_out "\t\t\t</VOIRAUSSI>\n";
		
		$count++;
	}
	print $f_log "regexp voir_aussi non trouvee dans $file_in\n" if($count==0);
}
##################################### * ##########################################

################################ FOCUS #######################################
sub FOCUS {
	my $f_out = $_[0];
	my $l = $_[1];
	my $file_in = $_[2];
	my $url;
	my $count = 0;

	#ouverture fichier log
	my $f_log;
	open($f_log, ">>","log/id_partie/focus") or die "Impossible d'ouvrir en lecture log/id_partie/focus \n";
	
	#<titreArticle> </titreArticle>
	#<dateArticle> </dateArticle>
	#<urlImage> </urlImage>
	#<resumeArticle> </resumeArticle>
	#<mailto> </mailto>
	#<auteur> </auteur>
		
	############ urlArticle ############
	if ( m/<a\sclass="S531"\shref="javascript:openPopup\('(.+)',.*?">Lire l'article<\/a>/ || m/<a\sclass="S531"\shref="(.+)">Lire l'article<\/a>/ ) {
		$url = $1;
		print $f_out "\t\t\t<urlArticle>";
		print $f_out $1;
		print $f_out "</urlArticle>\n";
	}
	else
	{
		print $f_log "regexp url non trouvee dans $file_in\n";
	}

	#S'il n'y a pas de Focus : pour la page lci-monde-2006-01-30.html nottamment !
	if (not defined $url) {
		return;
	}

	############ titreArticle ############
	print $f_out "\t\t\t<titreArticle>";
	if( $l =~ m/class="S401">(.+?)<\/a>/ )	{
		print $f_out $1;
	}
	else
	{
		print $f_log "regexp titre non trouvee dans $file_in\n";
	}
	print $f_out "</titreArticle>\n";

	############ dateArticle ############

	############ urlImage ############
	print $f_out "\t\t\t<urlImage>";
	if( $l =~ m/$url.+?<img\ssrc="(http.+?)"/ ) {
		print $f_out $1;
	}
	else
	{
		print $f_log "regexp image non trouvee dans $file_in\n";
	}
	print $f_out "</urlImage>\n";

	############ resumeArticle ############
	print $f_out "\t\t\t<resumeArticle>";
	if( $l =~ m/$url.+?class="S48">(.+?)<\/a>/ ) {
		print $f_out $1;
	}
	else
	{
		print $f_log "regexp resume non trouvee dans $file_in\n";
	}
	print $f_out "</resumeArticle>\n";

	############ mailto ############
	print $f_out "\t\t\t<mailto>";
	while ( $l =~ m/<a\shref="mailto:(.*?)".*?class="S14".+?<\/a>/g ) {
		print $f_out $1;
		$count++;
	}
	print $f_log "regexp mailto non trouvee dans $file_in\n" if($count==0);

	print $f_out "</mailto>\n";

	############ auteur ############

}
##################################### * ##########################################

################################ LES_GROSTITRES #######################################
sub LES_GROSTITRES {
	my $f_out = $_[0];
	my $l = $_[1];
	my $file_in = $_[2];
	my $url;
	my $count = 0;
	
	#ouverture fichier log
	my $f_log;
	open($f_log, ">>","log/id_partie/gros_titre") or die "Impossible d'ouvrir en lecture log/id_partie/gros_titre \n";
							         #$1                    $2                    $3                        $4                        $5
	while ( $l =~ m/<a\shref?.+?(\/news.*?\.html).+?<img\ssrc="(.+?)".+?class="S301">(.+?)<\/span>.+?class="S63">(.+?)<\/a>.+?class="S48">(.*?)<\/a>/g ) {
		print $f_out "\t\t\t<GROSTITRE>\n";

		############ urlArticle ############
		print $f_out "\t\t\t\t<urlArticle>";
		print $f_out $1;
		print $f_out "</urlArticle>\n";

		############ themeArticle ############
		print $f_out "\t\t\t\t<themeArticle>";
		print $f_out $3;
		print $f_out "</themeArticle>\n";

		############ titreArticle ############
		print $f_out "\t\t\t\t<titreArticle>";
		print $f_out $4;
		print $f_out "</titreArticle>\n";

		############ dateArticle ############

		############ urlImage ############
		print $f_out "\t\t\t\t<urlImage>";
		print $f_out $2;
		print $f_out "</urlImage>\n";

		############ resumeArticle ############
		print $f_out "\t\t\t\t<resumeArticle>";
		print $f_out $5;
		print $f_out "</resumeArticle>\n";

		############ mailto ############

		############ auteur ############


		print $f_out "\t\t\t</GROSTITRE>\n";

		$count++;
	}
	print $f_log "regexp gros_titre non trouvee dans $file_in\n" if($count==0);

}
##################################### * ##########################################

################################ LES_RAPPELS #######################################
sub LES_RAPPELS {
	my $f_out = $_[0];
	my $l = $_[1];
	my $file_in = $_[2];
	my $url;
	my $count = 0;

	#ouverture fichier log
	my $f_log;
	open($f_log, ">>","log/id_partie/rappel") or die "Impossible d'ouvrir en lecture log/id_partie/rappel \n";
							     #$1                         $2                    $3                      $4
	while ( $l =~ m/class="S48">(.+?)<\/span>.+?class="S301">(.+?)<\/span>.+?(\/news.+?\.html).+?class="S63">(.+?)<\/a>/g ) {
		print $f_out "\t\t\t<RAPPEL>\n";

		############ dateArticle ############
		print $f_out "\t\t\t\t<dateArticle>";
		print $f_out $1;
		print $f_out "</dateArticle>\n";

		############ themeArticle ############
		print $f_out "\t\t\t\t<themeArticle>";
		print $f_out $2;
		print $f_out "</themeArticle>\n";

		############ titreArticle ############
		print $f_out "\t\t\t\t<titreArticle>";
		print $f_out $4;
		print $f_out "</titreArticle>\n";

		############ urlArticle ############
		print $f_out "\t\t\t\t<urlArticle>";
		print $f_out $3;
		print $f_out "</urlArticle>\n";

		print $f_out "\t\t\t</RAPPEL>\n";

		$count++;
	}
	print $f_log "regexp rappel non trouvee dans $file_in\n" if($count==0);

}
##################################### * ##########################################
if ( not defined $ARGV[1] ) {
	system("clear");
	print "*** Script 2.x.x : Mise en format xml ***\n";
}

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
			&UNE($f_out, $_, $date, $ARGV[0]);
			print $f_out "\t\t</UNE>\n";
		}
		case 2 {
			print $f_out "\t\t<LES_VOIRAUSSI>\n";	
			&VOIRAUSSI($f_out, $_, $ARGV[0]);
			print $f_out "\t\t</LES_VOIRAUSSI>\n";
		}
		case 3 {
			print $f_out "\t\t<FOCUS>\n";
			&FOCUS($f_out, $_, $ARGV[0]);
			print $f_out "\t\t</FOCUS>\n";
		}
		case 4 {
			print $f_out "\t\t<LES_GROSTITRES>\n";
			&LES_GROSTITRES($f_out, $_, $ARGV[0]);
			print $f_out "\t\t</LES_GROSTITRES>\n";
		}
		case 5 {
			print $f_out "\t\t<LES_RAPPELS>\n";
			&LES_RAPPELS($f_out, $_, $ARGV[0]);
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
