#!/usr/bin/python
import cgi, cgitb
import time
import random

cgitb.enable()
print 'Content-Type: text/html;charset=utf-8'
print
print '<!DOCTYPE html>'
print '<html>'

print '<head><title>Hello World from Python</title></head>'
r = random.randint(1, 16)
color_list = ['aqua', 'black', 'blue', 'fuchsia', 'gray', 'green', 'lime', 'maroon',
              'navy', 'olive', 'purple', 'red', 'silver', 'teal', 'white', 'yellow']
print '<body style="background-color:' + color_list[r-1] + ';">'
print '<h2>Hello World from Python@' + str(time.time()) + '</h2>'
print '</body></html>'
