open(my $file_in1, "tfXidf_sort.txt" ) or die "Impossible d'ouvrir en lecture tfXidf_sort.txt\n";
open(my $file_in2, "stopListFrench.txt" ) or die "Impossible d'ouvrir en lecture tfXidf_sort.txt\n";
open(my $file_out, ">", "tfXidf_stop.txt") or die "Impossible d'ouvrir en écriture tfXidf_stop.txt\n";


my $limit = 0.63;
my $stopList;

while (<$file_in2>) {
	$stopList = $_;
}

while (<$file_in1>) {
	#      1$lci     2$mot    3$tfXidf
	if ( /(.+?)\t(.+?)\t(.+$)/ ) {
		print ">" . $2 . "<\n";
		if ( $stopList =~ m/\s$2\s/ ) {
			print $2 . "\n";
		}
		else {
			if ( $3 >= $limit ) {
				print $file_out $_;
			}
		}
	}
}