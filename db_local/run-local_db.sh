#!/usr/bin/env bash

# Clean up
./clean-docker.sh

# Build & Run
nerdctl build --no-cache -t y1sh/roppa-db_local . \
  && nerdctl run -d -t -p 3306:3306 --name mariadb-local y1sh/roppa-db_local:latest
