# POST CODE REST API

- A REST API to to retrieve and add postcodes and suburbs

## Purpose

- To securely allow CRUD operations on MySql database through REST API on Spring security (Java)

## Dependencies

- The Spring boot app has the following maven dependencies:

  - Spring Starter Web
  - Spring Boot DevTools
  - Lombok
  - Validation
  - MySQL Driver
  - Spring Data JPA
  - mysql-connector-j
  - Model mapper
  - Spring security core
  - JSON web token

- You need to have SQL server installed to run this app.

- Postman or CURL is required to send requests to the server

## Design goals

- To build a "secure" REST API that exposes the database to CRUD operations

## Feaures

### Database initialization

- Programmatically initialise Database by creating a database called 'postcodes', creating tables and populating them by running data.sql

- The following property in applications.properties defer the running of data.sql file until tables are created.

  `spring.jpa.defer-datasource-initialization=true`

- The user can then add more data or work with the intial data in the database.

- The automatic data initialization allows the user to start CRUD operaitons instantaneously without having to worry about adding data first.

### CRUD Operations

- Get all Postcodes with suburbs
- Add a postcode and suburb

### Query Params

- Retrieve a postcode with postcode or suburb query params

### Authentication (Spring Security)

- Register a user using username, email and password (/auth/register)
- JWT based authentication
- Login with credentials (/auth/login)
- Only registered users are allowed to add new suburbs

### Error Handling

- Global Exception Handling

## Future Goals

- [ ] Map Update and Delete paths
- [x] Create frontend
- [ ] Deploy on cloud
