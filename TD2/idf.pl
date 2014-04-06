open(my $file_in, $ARGV[0] ) or die "Impossible d'ouvrir en lecture $file_in\n";
#open(my $file_out, ">", "idf.txt") or die "Impossible d'ouvrir en écriture idf.txt\n";

sub log10 {
	my $n = shift;
	return log($n)/log(10);
}

my $word="";
my $count=0;
my $nb = 328;



while (<$file_in>) {
	#          1$count       3$mot             5$lci            
	if ( /.+?([0-9]+)(\t|\s+)(.+)(\t|\s+)(\/.+$)/ ) {
			if ( $word eq "" ){
				$word = $3;
			} 
			if ( !($word eq $3) && !($word eq "") ){
				$count = &log10($nb/$count);
				#print $file_out "$word\t$count\n";
				print "$word\t$count\n";
				$word = $3;
				$count = 1;
			}
			else {
				$count++;
			}
	}
}

$count = &log10($nb/$count);
#print $file_out "$word\t$count";
print "$word\t$count\n";