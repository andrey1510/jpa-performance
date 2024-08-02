FROM postgres:15.3-alpine3.18 AS build
COPY dvdrental.tar /tmp/
COPY init.sh /docker-entrypoint-initdb.d/