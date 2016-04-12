<?php
$method = $_SERVER['REQUEST_METHOD'];
if ($method == "POST") {
   $actionType = $_POST;
 }
else {
   $actionType = $_GET;
}

$num =  $actionType['magicnum'];

echo "<!DOCTYPE html>
		  	<html lang='en'>
			  	<head>
			  		<meta charset='utf-8'>
	    	  		<title>Processed with PHP</title>
	    	    </head>
	    	    <body>";
while ($num > 0) {
    echo "\n";
    echo "<h1>Hello " . $actionType['username'] . " with a password of " . $actionType['password'] . "! </h1>";
    $num--;
}

echo "
              </body>
            </html>";

?>
