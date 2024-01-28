Spring Boot CRUD Application

This project is a simple CRUD (Create, Read, Update, Delete) example using Spring Boot for a Students table in a relational database. It exposes RESTful APIs for performing these operations.

Table of Contents

Overview

Technologies Used

Setup

API Endpoints

Usage


Overview

The project demonstrates the implementation of a basic CRUD application with Spring Boot. It utilizes Spring Data JPA for data access and exposes RESTful APIs for interacting with a Students table in the underlying relational database.

Technologies Used

Spring Boot

Spring Data JPA

MySQL

Setup


Clone the repository:

bash
Copy code
git clone https://github.com/your-username/spring-boot-crud.git
Configure your MySQL database properties in the application.properties file.

Build the project:

bash
Copy code
./mvnw clean install
Run the application:


bash
Copy code
./mvnw spring-boot:run
API Endpoints

GET /api/students: Retrieve all students.

GET /api/students/{id}: Retrieve a student by ID.

POST /api/students: Create a new student.

POST /api/students/update: Update an existing student.

DELETE /api/students/{id}: Delete a student by ID.

Usage
You can use any API testing tool (e.g., Postman) to interact with the exposed endpoints. Here's an example of using cURL to create a new student:

bash
Copy code
curl -X POST -H "Content-Type: application/json" -d '{"firstName":"John","lastName":"Doe","age":25,"department":"Computer Science"}' http://localhost:8080/api/students



