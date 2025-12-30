# Student_Management_Application

A RESTful Student Management System built using Spring Boot that supports CRUD operations and filtering APIs for managing student data.

---

## 🚀 Features

- Create, Read, Update, Delete students
- Filter students by gender
- Filter students by technology
- Filter by gender and technology together
- API documentation using Swagger UI
- API testing using Postman

---

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA (Hibernate)
- MySQL
- Swagger UI
- Postman

---

## 🔗 REST API Endpoints

### Student APIs

| Method | Endpoint | Description |
|------|---------|------------|
| POST | /students | Create student |
| GET | /students | Get all students |
| GET | /students/{id} | Get student by ID |
| PUT | /students/{id} | Update student |
| DELETE | /students/{id} | Delete student |

---

### Filter APIs

| Method | Endpoint | Description |
|------|---------|------------|
| GET | /students/gender/{gender} | Filter by gender |
| GET | /students/technology/{tech} | Filter by technology |
| GET | /students/filter?gender=&technology= | Filter by gender & technology |

---

## 🗄 Database Configuration

Configure MySQL in application.properties:

- spring.datasource.url=jdbc:mysql://localhost:3306/student_db
- spring.datasource.username=your_username
- spring.datasource.password=your_password
- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.show-sql=true
- spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

------------------------------------------------------------

## 📄 Swagger API Documentation

Access Swagger UI after running the application:
http://localhost:8080/swagger-ui/index.html

------------------------------------------------------------

---

## ▶️ How to Run

1. Clone the repository
2. Open in IntelliJ / Eclipse
3. Create database student_db in MySQL
4. Update the 'application.properties' file
5. Run StudentManagementApplication
6. Test APIs using Swagger or Postman

---

## 🎯 What This Project Demonstrates

- Clean layered architecture (Controller, Service, Repository)
- Proper REST API design
- Spring Data JPA instead of raw SQL
- Real-world filtering APIs
- API documentation & testing

---

## 🔮 Future Enhancements

- Validation using @Valid
- Global exception handling
- Pagination & sorting
- Spring Security + JWT

---

## 👨‍💻 AUTHOR

Developed with ❤️ by [Muthu Krishnan B](https://github.com/krish8778)
