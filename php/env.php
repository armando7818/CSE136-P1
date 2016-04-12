<?php
$browser = array ("HTTP_ACCEPT","HTTP_ACCEPT_ENCODING","HTTP_ACCEPT_LANGUAGE","HTTP_CONNECTION","HTTP_HOST",
                  "HTTP_UPGRADE_INSECURE_REQUESTS","HTTP_USER_AGENT");
$server = array ("CONTEXT_DOCUMENT_ROOT", "CONTEXT_PREFIX","DOCUMENT_ROOT","GATEWAY_INTERFACE","PATH",
                  "SCRIPT_FILENAME","SCRIPT_NAME","SERVER_ADDR","SERVER_ADMIN","SERVER_NAME","SERVER_PORT",
                  "SERVER_PROTOCOL","SERVER_SIGNATURE","SERVER_SOFTWARE");
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
         if (in_array($key,$browser))
         echo "<tr><td>".$key."</td><td>" .$val."</tr>";
        }
        echo "
            </table>
                  </body>
                </html>";
?>
