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
  
## Postman

POST data

{
    "firstName": "David",
    "lastName": "Windsor",
    "emailId": "david.windsor@fullstack.com",
    "products": [
        {
            "productName": "Sony TV 4K",
            "productDescription": "75 inch Television latest technology",
            "price": "2995.00"
        },
        {
            "productName": "Apple Mac Pro 13 inch",
            "productDescription": "16gb memory 2.8hz fast retina laptop",
            "price": ""
        }
    ],
    "address": {
        "buildingName": "Del Amitri House",
        "flatNumber": "554",
        "addressline1": "523",
        "addressline2": "Alvah Ramp",
        "addressline3": "Dehrastig",
        "town": "Rio De Janeiro",
        "postCode": "50032",
        "county": "Buckinghamshire"
    }
},
{
    "firstName": "David",
    "lastName": "Windsor",
    "emailId": "david.windsor@fullstack.com",
    "products": [
        {
            "productName": "Sony TV 4K",
            "productDescription": "75 inch Television latest technology",
            "price": "2995.00"
        },
        {
            "productName": "Apple Mac Pro 13 inch",
            "productDescription": "16gb memory 2.8hz fast retina laptop",
            "price": ""
        }
    ],
    "address": {
        "buildingName": "Del Amitri House",
        "flatNumber": "554",
        "addressline1": "523",
        "addressline2": "Alvah Ramp",
        "addressline3": "Dehrastig",
        "town": "Rio De Janeiro",
        "postCode": "50032",
        "county": "Buckinghamshire"
    }
},
{
    "firstName": "David",
    "lastName": "Windsor",
    "emailId": "david.windsor@fullstack.com",
    "products": [
        {
            "productName": "Sony TV 4K",
            "productDescription": "75 inch Television latest technology",
            "price": "2995.00"
        },
        {
            "productName": "Apple Mac Pro 13 inch",
            "productDescription": "16gb memory 2.8hz fast retina laptop",
            "price": ""
        }
    ],
    "address": {
        "buildingName": "Del Amitri House",
        "flatNumber": "554",
        "addressline1": "523",
        "addressline2": "Alvah Ramp",
        "addressline3": "Dehrastig",
        "town": "Rio De Janeiro",
        "postCode": "50032",
        "county": "Buckinghamshire"
    }
}
  
## React
  
- /react-frontend accompany's this project to CRUD data, but it has issues


## Jenkins
  
- automatic build in Jenkins
