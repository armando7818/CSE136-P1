#!/usr/bin/node
var sys=require("sys");
sys.puts("Content-type: text/html\n");
sys.puts("<!DOCTYPE html>\n");
sys.puts("<html lang='en'>\n");
sys.puts("<head>\n");
sys.puts("<meta charset='utf-8'>\n");
sys.puts("<title>Hello Javascript Example</title>");
sys.puts("</head>");
var colorsList = ["aqua", "black", "blue", "fuchsia", "gray", "green", "lime", "maroon", "navy", "olive", "purple", "red", "silver", "teal", "white", "yellow"];
var color = colorsList[Math.floor((Math.random() * 15))]; 
console.log("<body style='background-color: " + color + "'>");
console.log("<p>Hello World from JavaScript @" + Date.now() + "<\p>");
sys.puts("</body>");
sys.puts("</html>");

