#!/usr/bin/env bash
java -Dapp.name=wise-db-hackathon-server -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8000 -jar target/wise-db-hackathon-server-0.1.0.jar