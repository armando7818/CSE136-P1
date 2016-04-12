#!/bin/sh

#note: HTTP_ACCEPT_ENCODING, HTTP_USER_AGENT, SERVER_SOFTWARE are causing internal server error

java -Dcontext_document_root=$CONTEXT_DOCUMENT_ROOT \
  -Dcontext_prefix=$CONTEXT_PREFIX \
  -Ddocument_root=$DOCUMENT_ROOT \
  -Dgateway_interface=$GATEWAY_INTERFACE \
  -Dhttp_accept=$HTTP_ACCEPT \
  \
  -Dhttp_accept_language=$HTTP_ACCEPT_LANGUAGE \
  -Dhttp_cache_control=$HTTP_CACHE_CONTROL \
  -Dhttp_connection=$HTTP_CONNECTION \
  -Dhttp_dnt=$HTTP_DNT \
  -Dhttp_host=$HTTP_HOST \
  \
  -Dpath=$PATH \
  -Dquery_string=$QUERY_STRING \
  -Dremote_addr=$REMOTE_ADDR \
  -Dremote_port=$REMOTE_PORT \
  -Drequest_method=$REQUEST_METHOD \
  -Drequest_scheme=$REQUEST_SCHEME \
  -Drequest_uri=$REQUEST_URI \
  -Dscript_filename=$SCRIPT_FILENAME \
  -Dscript_name=$SCRIPT_NAME \
  -Dserver_addr=$SERVER_ADDR \
  -Dserver_admin=$SERVER_ADMIN \
  -Dserver_name=$SERVER_NAME \
  -Dserver_port=$SERVER_PORT \
  -Dserver_protocol=$SERVER_PROTOCOL \
  -Dserver_signature=$SERVER_SIGNATURE \
  \
EnvironmentVariables