#!/bin/sh

java -Dcontent_length=$CONTENT_LENGTH \
    -Drequest_method=$REQUEST_METHOD \
    -Dquery_string=$QUERY_STRING \
ProcessData