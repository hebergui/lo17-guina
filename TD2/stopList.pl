open(my $file_tfXidf, "tfXidf.txt" ) or die "Impossible d'ouvrir en lecture tfXidf.txt\n";

my $limit = 0.183435383796074; #tf X idf du mot président
my $stopList = " ";

while (<$file_tfXidf>) {
	#      1$lci     2$mot    3$tfXidf
	if ( /(.+?)\t(.+?)\t(.+$)/ ) {
		if ( $3 < $limit || length($2) <= 2  ) {
			if ( $stopList =~ m/\s$2\s/ ) {
				#le mot est déjà dans la stopList
			}
			else {
				$stopList .= "$2 ";
				print "$2\n";
			}
		}
	}
}

print "\n$dump/$total";
close($file_tfXidf);