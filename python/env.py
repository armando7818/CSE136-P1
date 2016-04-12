#!/usr/bin/python
import cgi, cgitb
import os
from operator import itemgetter

cgitb.enable()

server_var = ['DOCUMENT_ROOT', 'PATH', 'HTTPS', 'CONTEXT_DOCUMENT_ROOT', 'CONTEXT_PREFIX', 'GATEWAY_INTERFACE']
browser_var = ['HTTP_COOKIE', 'HTTP_USER_AGENT', 'HTTP_REFERER', 'HTTP_HOST', 'HTTP_ACCEPT', 'HTTP_ACCEPT_ENCODING', 'HTTP_ACCEPT_LANGUAGE', 'QUERY_STRING', 'REMOTE_ADDR', 'REMOTE_PORT', 'SCRIPT_FILENAME', 'SCRIPT_NAME']
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
print '<table style="width:80%">'
env_sorted = sorted(env.items(), key = itemgetter(0))
for k, v in env_sorted:
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