<?php
$browser = array ("HTTP_ACCEPT","HTTP_ACCEPT_ENCODING","HTTP_ACCEPT_LANGUAGE","HTTP_CONNECTION","HTTP_HOST",
                  "HTTP_UPGRADE_INSECURE_REQUESTS","HTTP_USER_AGENT","QUERY_STRING","REMOTE_ADDR", "REMOTE_PORT",
                   "REQUEST_METHOD","REQUEST_SCHEME","REQUEST_URI");
$server = array ("CONTEXT_DOCUMENT_ROOT", "CONTEXT_PREFIX","DOCUMENT_ROOT","GATEWAY_INTERFACE","PATH",
                  "SCRIPT_FILENAME","SCRIPT_NAME","SERVER_ADDR","SERVER_ADMIN","SERVER_NAME","SERVER_PORT",
                  "SERVER_PROTOCOL","SERVER_SIGNATURE","SERVER_SOFTWARE");
echo "<!DOCTYPE html>
        <html lang='en'>
          <head>
            <meta charset='utf-8'>
              <title>Processed with PHP</title>
              <style>
                h1 { text-align: center }
               table, td, th { border: 1px solid gray }
               </style>
            </head>
            <body>
            <h1>Environment Variables</h1>
            <h2>Browser Variables</h2>
            <table style= 'width:300px;'>";
    ksort($_SERVER);
    foreach ($_SERVER as $key=>$val )
       {
         if (in_array($key,$browser)) {
         echo "<tr><td>".$key."</td><td>" .$val."</tr>";
       }
      }
      echo "</table>";
      echo "<h2>Server Variables</h2>
            <table style= 'width:300px;'>";
       foreach ($_SERVER as $key=>$val )
          {
            if (in_array($key,$server)) {
                echo "<tr><td>".$key."</td><td>" .$val."</tr>";
             }
          }
        echo "
            </table>
                  </body>
                </html>";
?>
