#!/usr/bin/ruby

puts "Content-type:text/html\r\n\r\n"
puts '<!DOCTYPE html>'
puts '<html lang="en">'
puts '<head>'
puts '<meta charset="utf-8">'
puts '<title>Environment Variables - Ruby</title>'
puts '</head>'
puts '<body>'
puts '<table border="1" style="width:300px">'

sortENV=ENV.sort_by { |k, v| k }

sortENV.each do |key, value|
    puts '<tr>' 
    puts "<td> #{key}</td>"
    puts "<td> #{value}</td>"
    puts '</tr>'
end

puts '</table>'
puts '</body>'
puts '</html>'
