#!/usr/bin/python
import cgi, cgitb
import os

cgitb.enable()
print 'Content-Type: text/html;charset=utf-8'
print
print '<!DOCTYPE html>'
print '<html>'

print '<head><title>Env from Python</title>'
print '<style>'
print 'h1 { text-align: center }'
print 'table, td, th { border: 1px solid gray }'
print '</style>'
print '</head>'
print '<body>'
print '<h1>Environment Variables</h1>'
env = os.environ
print '<table style="width:100%">'
for k, v in env.items():
    print '<tr>'

    print '<td>'
    print k
    print '</td>'

    print '<td>'
    print v
    print '</td>'

    print '</tr>'
print '</table>'
print '</body></html>'
