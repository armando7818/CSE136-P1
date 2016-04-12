#!/usr/bin/node
var browser = ["HTTP_ACCEPT","HTTP_ACCEPT_ENCODING","HTTP_ACCEPT_LANGUAGE","HTTP_CONNECTION","HTTP_HOST","HTTP_UPGRADE_INSECURE_REQUESTS","HTTP_USER_AGENT","QUERY_STRING","REMOTE_ADDR", "REMOTE_PORT", "REQUEST_METHOD","REQUEST_SCHEME","REQUEST_URI"];
var server = ["CONTEXT_DOCUMENT_ROOT", "CONTEXT_PREFIX","DOCUMENT_ROOT","GATEWAY_INTERFACE","PATH", "SCRIPT_FILENAME","SCRIPT_NAME","SERVER_ADDR","SERVER_ADMIN","SERVER_NAME","SERVER_PORT","SERVER_PROTOCOL","SERVER_SIGNATURE","SERVER_SOFTWARE"];
sys=require("sys");
sys.puts("Content-type: text/html\n");
sys.puts("<head>");
sys.puts("<meta charset='utf-8'>");
sys.puts("<title>Processed with JS(NODE)</title>");
sys.puts("<style> h1 { text-align: center} ");
sys.puts("table, td, th { border: 1px solid gray} ");
sys.puts("</style></head><body>");
sys.puts("<h1>Enviornment Variables</h1>");
sys.puts("<h2>Browser Variables</h2>\n");
var theKeys = Object.keys(process.env).sort();
var theKeys2 = Object.keys(process.env).sort();
sys.puts("<table style='width:300px'>");
theKeys.forEach(function(k) {
var v = process.env[k];
   if (browser.indexOf(k) > -1)
   sys.puts("<tr><td>"+ k  +"</td><td>"+ v+ "</tr>\n");
});
sys.puts("</table><h2>Server Variables</h2>");
sys.puts("<table style='width:300px'>");
theKeys2.forEach(function(k) { 
var v = process.env[k]; 
   if (server.indexOf(k) > -1)
   sys.puts("<tr><td>"+ k +"</td><td>"+ v + "</tr>\n");
});
sys.puts("</table></body></html>");

