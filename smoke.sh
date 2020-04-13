#!/bin/bash
apt-get update -y && apt-get install -y maven
appium &
cd /usr/src/app/; mvn clean test -Dtest=LoginTest.java
