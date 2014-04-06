open(my $file_idf, "idf.txt" ) or die "Impossible d'ouvrir en lecture idf.txt\n";
open(my $file_tf, "tf.txt") or die "Impossible d'ouvrir en lecture tf.txt\n";

my $word="";
my $count=0;
my %tab;

while (<$file_idf>) {
	#      mot$1        idf$3    
	if ( /(^.+?)(\t|\s+)(.+)$/ ) {
		#print "$1----$3\n";
		$tab{$1} .= $3;
	}
}

while (<$file_tf>) {
		#     count$1        mot$3       lci$5            
	if ( /.+?([0-9]+)(\t|\s+)(.+)(\t|\s+)(\/.+$)/ ) {
		if ( exists $tab{$3} )  {
			my $tmp = $tab{$3}*$1; #tf*idf
			print "$5\t$3\t$tmp\n";
		}
	}
}