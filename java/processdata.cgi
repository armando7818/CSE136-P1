#!/bin/sh

java -Dcgi.content_length=$CONTENT_LENGTH \
    -Dcgi.request_method=$REQUEST_METHOD \
    -Dcgi.query_string=$QUERY_STRING \
ProcessData