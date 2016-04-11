#!/usr/bin/python

import cgi, cgitb
import time
import random

cgitb.enable()
print 'Content-Type: text/html;charset=utf-8'
print
print '<!DOCTYPE html>'
print '<html>'

print '<head><title>Form from Python</title></head>'
print '<body>'
form = cgi.FieldStorage()
if "username" not in form or "password" not in form or "magicnum" not in form:
    print "<h1>Error</h1>"
    print "Please fill in the form."
else:
    username = form['username'].value
    pwd = form['password'].value
    magic = int(form['magicnum'].value)

    for i in range(magic):
        print '<h1>Hello ' + username + ' with a password of ' + pwd + '!</h1>'

print '</body></html>'
