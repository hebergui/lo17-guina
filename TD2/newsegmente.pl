#!/usr/bin/perl

for ($i=0; $i<3; $i++) { 
   if ($ARGV[0] =~ /^-[fta]$/) {
	$opt = shift(@ARGV);
	if ($opt =~ /f/) {
		$fbavard=1;
	} elsif ($opt =~ /t/) {
		$tbavard=1;
	} else {
		$abavard=1;	
	}
   }
}

while (<>) {
	if (/<FICHIER>(.*)<\/FICHIER>/i && ($fbavard==1)) {
		$fichier = $1;
		$type = "";
		$article = "";
#		$fichier =~ s/LCINORM\//;
		$fichier =~ s/LCINORM_SPLIT//;
		$fichier="\t".$fichier;
		}
	if (/<UNE>/i && ($tbavard == 1)) {
		$type = "\tUNE";
		}
	if (/<FOCUS>/i && ($tbavard == 1)){
		$type = "\tFOCUS";
		}
	if (/<GROSTITRE>/i && ($tbavard ==1)) {
		$type = "\tGROSTITRE";
		}
	if (/<VOIRAUSSI>/i && ($tbavard ==1)) {
		$type = "\tVOIRAUSSI";
		}
	if (/<RAPPEL>/i && ($tbavard == 1)) {
		$type = "\tRAPPEL";
		}
	if (/<urlArticle>(.+\.html).*?<\/urlArticle>/i && ($abavard==1)) {
		$article = $1;
		$article="\t".$article;
		}
	if (/<(titreArticle|resumeArticle)>/i) {
		s/> />/;
		s/<.*?>//g;
		s/\t//g;
		s/[0-9]+//g;
		s/[ \t',.;:?\/"`_!\n>&~»\$-\(\)-]+/$fichier$type$article\n/g;
		tr/A-Z/a-z/;
		s/^\t.*?\n//;
		
		unless (/^\t/) {
			print "$_";
			}
		}
	}
