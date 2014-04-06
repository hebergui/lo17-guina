@balises = ("titreArticle", "dateArticle", "urlImage", "resumeArticle", "mailto", "auteur", "themeArticle");
foreach $balise (@balises) {
	print STDERR "\tCréation du fichier inverse pour la balise $balise (>inverse_$balise.txt)... ";
	$cmd = `perl prof/index.pl $balise corpusA09_out.xml | sort -k1 > inverse_$balise.txt`;
	print STDERR "OK\n";
}