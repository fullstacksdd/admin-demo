# admin-demo

## Overview

- Spring Boot 
- MongoDb
- PostMan
- React

## MongoDB

- Download Mongo Server
- mkdir mongodb/mongodb-data/data/db
- cd <path>/mongodb-macos-x86_64-5.0.6/bin
- ./mongod --dbpath mongodb/mongodb-data/data/db

## Spring Boot

- Spring Tool Suite
- Clone admin-demo from GIT
- Create new Java project admin-demo
- Java 11
- mvn clean (or use IDE right click project) 
- mvn install (or ditto)
- Check for any test failures
- Open terminal
- cd <path>/admin-demo/target
- java -jar admin-demo-0.0.1-SNAPSHOT.jar
- Open http://localhost:8080/api/v1/customers
- Check MongoDB has data with e.g. Robo 3T or

- Use Postman to test with endpoints as follows ...
  
- POST - http://localhost:8080/api/v1/customers
- PUT - http://localhost:8080/api/v1/customers/1
- GET - http://localhost:8080/api/v1/customers/
- GET - http://localhost:8080/api/v1/customers/1
- DELETE - http://localhost:8080/api/v1/customers/3
  
- /react-frontend is a react project to CRUD data its has some issues



