#!/usr/bin/env bash

BRANCH_NAME=$(git rev-parse --abbrev-ref HEAD)
COMMIT_ID=$(git rev-parse --short HEAD)

TAG_NAME="${BRANCH_NAME}_${COMMIT_ID}"

# Clean up
./clean-docker.sh

# Build
nerdctl build --no-cache -t y1sh/roppa-db_local:$TAG_NAME . \
  && nerdctl push y1sh/roppa-db_local:$TAG_NAME
