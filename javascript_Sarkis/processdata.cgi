#!/usr/bin/node
var sys=require("sys");
var requestData = "";
var magicNumber = null; 


sys.puts("Content-type: text/html\n");
sys.puts("<!DOCTYPE html>\n");
sys.puts("<html lang='en'>\n");
sys.puts("<head>\n");
sys.puts("<meta charset='utf-8'>\n");
sys.puts("<title>Process get and post</title>");
sys.puts("</head>");

process.stdin.on("data", function(data) {
	requestData = data.toString(); 
	requestData = getJsonFromUrl(requestData);
	if(requestData['username'] && requestData['password'] && requestData['magicnum'])
	{
		magicNumber = parseInt(requestData['magicnum']);
		for(i =0; i< magicNumber; i++)
			{
				console.log("<h1>Hello "+requestData['username'] + " with a password of "+  requestData['password'] +"! </h1>");
			}
	}
	else
	{
		console.log("<h1>An Error Has Occurred. Check inputs.</h1>"); 
	}
});

if(process.env.QUERY_STRING)
{
	requestData = getJsonFromUrl(process.env.QUERY_STRING); 
	if(requestData['username'] && requestData['password'] && requestData['magicnum'])
	{
		magicNumber = parseInt(requestData['magicnum']);
		for(i =0; i< magicNumber; i++)
			{
				console.log("<h1>Hello "+requestData['username'] + " with a password of "+  requestData['password'] +"! </h1>");
			}
	}
	else
	{
		console.log("<h1>An Error Has Occurred. Check inputs.</h1>"); 
	}
}

sys.puts("</body>");

function getJsonFromUrl(params) {
  var query = params;
  var result = {};
  query.split("&").forEach(function(part) {
    var item = part.split("=");
    result[item[0]] = decodeURIComponent(item[1]);
  });
  return result;
}
