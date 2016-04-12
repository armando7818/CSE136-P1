#!/usr/bin/node

var sys=require("sys");
sys.puts("Content-type: text/html\n");
sys.puts("Hello World!<br/>\n");
var argstr="";
for(var i in process.env){
  argstr+=i+": " + process.env[i] + "<br/>\n";
}
sys.puts("args: "+ argstr +"<br/>\n");