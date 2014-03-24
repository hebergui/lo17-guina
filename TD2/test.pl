open(my $file_in1, "idf.txt" ) or die "Impossible d'ouvrir en lecture idf.txt\n";
open(my $file_in2, "tf.txt") or die "Impossible d'ouvrir en lecture tf.txt\n";
open(my $file_out, "tfXidf.txt") or die "Impossible d'ouvrir en écriture tfXidf.txt\n";

my $word="";
my $count=0;
my %tab;

while (<$file_in1>) {
	if ( /(^.+?)(\t|\s+)(.+)$/ ) {
		#print "$1----$3\n";
		$tab{$1} .= $3;
	}
}


#foreach my $key (keys %tab) {
#	print "$key : $tab{$key}\n";
#}

while (<$file_in2>) {
		#          1$count       3$mot             5$lci            
	if ( /.+?([0-9]+)(\t|\s+)(.+)(\t|\s+)(\/.+$)/ ) {
		if ( exists $tab{$3} )  {
			my $tmp = $tab{$3}*$1; #tf*idf
			#             idPage mot tf*idf
			print $file_out "$5\t$3\t$tmp\n";
		}
	}
}