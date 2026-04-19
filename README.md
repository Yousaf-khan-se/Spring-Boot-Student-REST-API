# Spring Boot Student REST API

## Description
A modern web application backend built using Spring Boot and Spring Data JPA. This project exposes a fully functional RESTful API to manage student records stored in a MySQL database.

## Concepts Demonstrated
* **Spring Boot:** Rapid application development and auto-configuration.
* **RESTful Architecture:** Handling `GET`, `POST`, `PUT`, and `DELETE` HTTP requests.
* **Spring Data JPA & Hibernate:** ORM mapping, automatic schema generation (`ddl-auto=update`), and database querying without writing raw SQL.
* **Dependency Injection:** Using `@Service`, `@RestController`, and `@Autowired` annotations.

## Features
* **Retrieve:** Fetch all students or a single student by ID.
* **Create:** Add a new student (Name, Date of Birth, GPA) via JSON payload.
* **Update/Delete:** Modify existing records or safely remove them.

## Setup & Configuration
1. **Database:** Install MySQL and create a database named `test`.
2. **Properties:** In `src/main/resources/application.properties`, configure your MySQL username and password.
3. **Dependencies:** Maven will automatically download dependencies (Spring Web, Spring Data JPA, MySQL Connector) specified in the `pom.xml`.

## How to Run
Run `StudentManagementApplication.java` as a standard Java application or use the terminal command:
`mvn spring-boot:run`
The API will be available at `http://localhost:9000/students`.
