#!/usr/bin/ruby

require 'time'


listOfColors = ["aqua", "black", "blue", "fuchsia", 
	"gray", "green", "lime", "maroon", "navy", 
	"olive", "purple", "red", "silver", "teal", "white", "yellow"]


def getRandomColor(arr)
    ranNum = rand(arr.length) 
    return arr[ranNum]	
end


puts "Content-type:text/html\r\n\r\n"
puts '<html>'
puts '<head>'
puts '</head>'
puts "<body style = 'background-color:#{getRandomColor(listOfColors)}'>"
puts "<p>Hello Word from ruby@#{Time.new}</p>"
puts '</body>'
puts '</html>'


