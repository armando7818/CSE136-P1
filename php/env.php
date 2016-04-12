<?php
echo "<!DOCTYPE html>
        <html lang='en'>
          <head>
            <meta charset='utf-8'>
              <title>Processed with PHP</title>
            </head>
            <body>
            <h1 align='center'>Environment Variables</h1>
            <table border='1' style='width:300px'>";
    ksort($_SERVER);
    foreach ($_SERVER as $key=>$val )
       {
         echo "<tr><td>".$key."</td><td>" .$val."</tr>";
        }
        echo "
            </table>
                  </body>
                </html>";
?>
