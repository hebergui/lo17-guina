$cmd = `LANG=C`;

print "*******************************\n";
print "* 1. CREATION D'UNE STOP-LIST *\n";

print "\nCalcul de tf (>tf.txt)... ";
$cmd = `perl prof/newsegmente.pl -f corpusA09.xml | sort | uniq -c > tf.txt`;
print "OK\n";

print "\nCalcul de df (>df.txt)... ";
$cmd = `perl prof/newsegmente.pl -f corpusA09.xml | sort -u | cut -f1 | uniq -c | sort -rn > df.txt`;
print "OK\n";

print "\nCalcul de idf (>idf.txt)... ";
$cmd = `perl idf.pl tf.txt > idf.txt`;
print "OK\n";

print "\nCalcul de tf X idf (>tfXidf.txt)... ";
$cmd = `perl tfXidf.pl | sort -k 3 > tfXidf.txt`;
print "OK\n";

print "\nConstruction de la stop-list (> stopList.txt)... ";
$cmd = `perl stopList.pl > stopListFull.txt`;
print "OK\n";

print "\nCréation du script filtre à partir de la stoplist (> stopList_filtre.pl)... ";
$cmd = `perl prof/newcreeFiltre.pl stopList.txt > stopList_filtre.pl`;
print "OK\n";

print "\nGénération du script de filtrage du corpus (> corpusA09_filtre.xml)... ";
$cmd = `perl stopList_filtre.pl corpusA09.xml > corpusA09_filtre.xml`;
print "OK\n";

print "**************************\n";
print "* 2. CREATION DES LEMMES *\n";

print "\nGénération du fichier des lemmes (> lemmes.txt)... ";
$cmd = `cat corpusA09_filtre.xml | perl prof/newsegmente.pl -f | sort -u | cut -f1 | uniq | sort > lemmes.txt`;
print "OK\n";

$t1 = time;
#générer la liste des successeurs pour chaque lettre des mots d’une liste de mots
print "\nCréation du fichier des successeurs (> successeurs.txt)... ";
$cmd = `perl prof/successeurs_2013.pl lemmes.txt | sort -k2 > successeurs.txt`;
$t2 = time;
print "OK (execute en ".($t2-$t1)." sec)\n";

print "\nCréation du fichier de troncation (> filtronc.txt)... ";
$cmd = `perl prof/filtronc.pl -v successeurs.txt > filtronc.txt`;
print "OK\n";

print "\nGénération du script de troncation du corpus (> lemmes_filtre.pl)... ";
$cmd = `perl prof/newcreeFiltre.pl filtronc.txt > lemmes_filtre.pl`;
print "OK\n";

$t1 = time;
print "\nLemmatisation du corpus (> corpusA09_out.xml)... ";
$c = `perl lemmes_filtre.pl corpusA09_filtre.xml > corpusA09_out.xml`;
$t2 = time;
print "OK (execute en ".($t2-$t1)." sec)\n";

print "*************************************\n";
print "* 3. CREATION DES FICHIERS INVERSES *\n";

