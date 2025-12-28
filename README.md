# Student_Management_Application

A RESTful Student Management System built using Spring Boot.  
This backend application provides CRUD operations and filtering APIs to manage student records efficiently using a layered architecture.

------------------------------------------------------------

FEATURES

- Create a new student record
- Retrieve all students
- Retrieve student by ID
- Update student details
- Delete student record
- Filter students by gender
- Filter students by technology
- Filter students by gender and technology
- Interactive API documentation using Swagger UI

------------------------------------------------------------

CONCEPTS USED

- RESTful API design
- Layered architecture (Controller, Service, Repository)
- Dependency Injection
- Spring Data JPA (Hibernate)
- Database CRUD operations
- API testing and documentation

------------------------------------------------------------

TECHNOLOGIES USED

- Programming Language: Java
- Framework: Spring Boot
- Web: Spring Web (REST APIs)
- ORM: Spring Data JPA (Hibernate)
- Database: MySQL
- API Documentation: Swagger UI
- API Testing: Postman

------------------------------------------------------------

PROJECT STRUCTURE

src/main/java
└── com.example.studentmanagement
    ├── controller
    ├── service
    ├── repository
    ├── entity
    └── StudentManagementApplication.java

------------------------------------------------------------

REST API ENDPOINTS

STUDENT APIs
POST    /students              -> Create student
GET     /students              -> Get all students
GET     /students/{id}         -> Get student by ID
PUT     /students/{id}         -> Update student
DELETE  /students/{id}         -> Delete student

FILTER APIs
GET /students/gender/{gender}
GET /students/technology/{tech}
GET /students/filter?gender=&technology=

------------------------------------------------------------

DATABASE CONFIGURATION

application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

------------------------------------------------------------

API DOCUMENTATION

Swagger UI URL:
http://localhost:8080/swagger-ui/index.html

------------------------------------------------------------

HOW TO RUN

1. Clone the repository:
   git clone https://github.com/your-username/Student_Management_System.git

2. Create MySQL database named student_db

3. Update database credentials in application.properties

4. Run StudentManagementApplication

5. Test APIs using Swagger UI or Postman

------------------------------------------------------------

KEY LEARNINGS

- Building REST APIs using Spring Boot
- Clean separation of concerns using layered architecture
- Database interaction using Spring Data JPA
- API testing with Postman
- API documentation using Swagger

------------------------------------------------------------

AUTHOR

Developed with ❤️ by [Muthu Krishnan B](https://github.com/krish8778)
