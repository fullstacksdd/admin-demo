# admin-demo

## Overview

- Spring Boot 
- MongoDb
- JUnit4
- React (TODO)

## MongoDB

- Download Mongo Server
- mkdir mongodb/mongodb-data/data/db
- cd <path>/mongodb-macos-x86_64-5.0.6/bin
- ./mongod --dbpath mongodb/mongodb-data/data/db

## Spring Boot

- Spring Tool Suite
- Create workspace
- Clone admin-demo from GIT
- Create new Java project admin-demo
- Set build to Java 11
- mvn clean (or use IDE right click project) 
- mvn install (or ditto)
- Check for any test failures
- Open terminal
- cd <path>/admin-demo/target
- java -jar admin-demo-0.0.1-SNAPSHOT.jar
- Open http://localhost:8080/api/v1/customers
- Check MongoDB has data with e.g. Robo 3T or
- Use Postman to run tests

## React


