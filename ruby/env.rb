#!/usr/bin/ruby

clientVar = ['HTTP_ACCEPT', 'HTTP_ACCEPT_ENCODING',
        'HTTP_ACCEPT_LANGUAGE', 'HTTP_CONNECTION',
        'HTTP_HOST', 'HTTP_UPGRADE_INSECURE_REQUESTS',
        'HTTP_USER_AGENT', 'QUERY_STRING', 'REMOTE_ADDR',
	'REMOTE_PORT', 'REQUEST_METHOD', 'REQUEST_SCHEME',
	'REQUEST_URI']
serverVar = ['CONTEXT_DOCUMENT_ROOT', 'CONTEXT_PREFIX',
	'DOCUMENT_ROOT', 'GATEWAY_INTERFACE', 'PATH',
	'SCRIPT_FILENAME', 'SCRIPT_NAME', 'SERVER_ADDR',
	'SERVER_ADMIN', 'SERVER_NAME', 'SERVER_PORT',
	'SERVER_PROTOCOL', 'SERVER_SIGNATURE', 
	'SERVER_SOFTWARE']

def printEnvTable(arr)
   puts '<table border="1" style="width:300px">'
   arr.each do |key|
       puts '<tr>'
       puts "<td> #{key}</td>"
       puts "<td> #{ENV[key]} </td>"
       puts '</tr>'
   end
   puts '</table>'
end

puts "Content-type:text/html\r\n\r\n"
puts '<!DOCTYPE html>'
puts '<html lang="en">'
puts '<head>'
puts '<meta charset="utf-8">'
puts '<title>Environment Variables - Ruby</title>'
puts '</head>'
puts '<body>'
puts '<h1>Browser Variables</h1>'
printEnvTable(clientVar)
puts '<h1> Server Variables</h1>'
printEnvTable(serverVar)
puts '</body>'
puts '</html>'


