#!/usr/bin/ruby
require 'cgi'

cgi = CGI.new

puts "Content-type:text/html\r\n\r\n"
puts '<!DOCTYPE html>'
puts '<html lang="en">'
puts '<head>'
puts '<meta charset="UTF-8">'
puts '<title>Processed with Ruby</title>'
puts '</head>'
puts '<body>'

numLoop = cgi['magicnum']
i=0
while i<numLoop.to_i do
    puts "<h1> Hello #{cgi['username']} with a password of #{cgi['password']}!</h1>"
    i+=1
end
puts '</body>'
puts '</html>'
