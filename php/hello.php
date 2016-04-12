<?php

	$listOfColors = array("aqua", "black", "blue", "fuchsia", "gray", "green", "lime", "maroon", "navy", "olive", "purple", "red", "silver", "teal", "white", "yellow");
	$randomNumber = rand(0,15);
	printHelloWorldRandomColor($listOfColors[$randomNumber]);

	function printHelloWorldRandomColor($randomColor)
	{
		echo "<!DOCTYPE html>
		  	<html lang='en'>
			  	<head>
			  		<meta charset='utf-8'>
	    	  		<title>Hello PHP Example</title>
	    	    </head>
	    	    <body style ='background-color:". $randomColor."'".">";
		echo "<p>Hello World from PHP @ ". time() ."</p>
		        </body>
		    </html>";
	}

?>
