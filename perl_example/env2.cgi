#!/usr/bin/perl
print "Content-type: text/html \n\n";

# print HTML file top
print <<END;
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html><head><title>Environment Variables</title>
</head><body><h1 align="center">Environment Variables env2</h1><hr />
END

foreach my $key (sort(keys(%ENV))) {
   print  "$key = $ENV{$key}<br />\n";
}

print <<END; 
<h1 align = "center"> ENV1 </h1><hr/>
END

foreach $variable (sort keys %ENV) {
  print "<b>$variable:</b> $ENV{$variable}<br />\n";
}

# Print the HTML file bottom
print "</body></html>";