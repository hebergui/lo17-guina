$cmd = `LANG=C`;

print "*******************************\n";
print "* 1. CREATION D'UNE STOP-LIST *\n";
print "*******************************\n";

print "Calcul de tf (>tf.txt)... ";
$cmd = `perl prof/newsegmente.pl -f corpusA09.xml | sort | uniq -c > tf.txt`;
print "OK\n";

print "Calcul de df (>df.txt)... ";
$cmd = `perl prof/newsegmente.pl -f corpusA09.xml | sort -u | cut -f1 | uniq -c | sort -rn > df.txt`;
print "OK\n";

print "Calcul de idf (>idf.txt)... ";
$cmd = `perl idf.pl tf.txt > idf.txt`;
print "OK\n";

print "Calcul de tf X idf (>tfXidf.txt)... ";
$cmd = `perl tfXidf.pl | sort -k 3 > tfXidf.txt`;
print "OK\n";

print "Construction de la stop-list (>stopList.txt)... ";
$cmd = `perl stopList.pl > stopListFull.txt`;
print "OK\n";

print "Création du script filtre à partir de la stoplist (>stopList_filtre.pl)... ";
$cmd = `perl prof/newcreeFiltre.pl stopList.txt > stopList_filtre.pl`;
print "OK\n";

print "Génération du script de filtrage du corpus (>corpusA09_filtre.xml)... ";
$cmd = `perl stopList_filtre.pl corpusA09.xml > corpusA09_filtre.xml`;
print "OK\n";
print "*******************************END*********************************\n\n";

print "**************************\n";
print "* 2. CREATION DES LEMMES *\n";
print "**************************\n";

print "Génération du fichier des mots du corpus (>mots.txt)... ";
$cmd = `cat corpusA09_filtre.xml | perl prof/newsegmente.pl -f | sort -u | cut -f1 | uniq | sort > mots.txt`;
print "OK\n";

$t1 = time;
print "Création du fichier des successeurs (>successeurs.txt)... ";
$cmd = `perl prof/successeurs_2013.pl mots.txt | sort -k2 > successeurs.txt`;
$t2 = time;
print "OK (execute en ".($t2-$t1)." sec)\n";

print "Création du fichier de troncation (>filtronc.txt)... ";
$cmd = `perl prof/filtronc.pl -v successeurs.txt > filtronc.txt`;
print "OK\n";

print "Création du fichier de l'ensemble des lemmes du corpus (>lemmes.txt)... ";
$cmd = `cat filtronc.txt | cut -f2 | uniq | sort > lemmes.txt`;
print "OK\n";

print "Génération du script de troncation du corpus (>lemmes_filtre.pl)... ";
$cmd = `perl prof/newcreeFiltre.pl filtronc.txt > lemmes_filtre.pl`;
print "OK\n";

$t1 = time;
print "Lemmatisation du corpus (>corpusA09_out.xml)... ";
$cmd = `perl lemmes_filtre.pl corpusA09_filtre.xml > corpusA09_out.xml`;
$t2 = time;
print "OK (execute en ".($t2-$t1)." sec)\n";
print "*******************************END*********************************\n\n";

print "*************************************\n";
print "* 3. CREATION DES FICHIERS INVERSES *\n";
print "*************************************\n";

print "Création des fichiers d'inverses pour chaque balise\n";
$cmd = `perl fichiers_inverses.pl`;

print "Création du fichier d'inverses gobal du corpus (>inverse.txt)... ";
$cmd = `cat corpusA09_out.xml | perl prof/newsegmente.pl -f -a -t | perl prof/newindexMot.pl | sort -k1 > inverse.txt`;
print "OK\n";

print "Création du fichier de l'ensemble des lemmes à partir du fichier inverse (>lemmes_inverse.txt)... ";
$cmd = `cat inverse.txt | awk '{print $1}' > lemmes_inverse.txt`;
print "OK\n";
print "*******************************END*********************************\n\n";