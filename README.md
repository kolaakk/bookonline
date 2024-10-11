This is a simple Java Spring Boot application for managing an online bookstore. It supports basic CRUD operations for Books, Customers, and Orders and implements validation to ensure data integrity. The project is built with Java 17, Spring Boot, Spring Data JPA, Hibernate Validator, and an H2 in-memory database for development.

Features
Books: Add, retrieve, update, and delete books.
Customers: Add, retrieve, update, and delete customers, with validation to prevent duplicate email addresses.
Orders: Place orders by associating customers with books.
Validation: Includes validation for fields like null checks, email format validation, and uniqueness of customer email.
Technologies Used
Java 17
Spring Boot
Spring Data JPA
Hibernate Validator (JSR-380) for validation
H2 Database (in-memory for development)
Maven as the build tool
Prerequisites
To run this application, you need to have the following installed on your machine:

Java 17: Make sure you have the correct version of Java installed.
Maven: Ensure that Maven is installed and configured on your system.
Postman or Curl (optional): For testing the REST API.
Check Java Version
Ensure Java 17 is installed:
java -version
Check Maven Version
Ensure Maven is installed:
mvn -version

1. Clone the Repository
First, clone this repository to your local machine:
https://github.com/kolaakk/bookonline.git

3. Build the Project
Use Maven to clean and build the project. This will also download all necessary dependencies:
mvn clean install


4. Run the Application
After building, you can run the application using the following Maven command:
mvn spring-boot:run

4. Access the Application
Once the application is running, you can access it at:
http://localhost:8080
You can now use tools like Postman or cURL to test the REST API endpoints.
Get All Books:
GET http://localhost:8080/api/books

POST http://localhost:8080/api/books
Body (JSON):
{
    "title": "Spring Boot ",
    "author": "Kola Ajayi",
    "price": 39.99,
    "stock": 50
}
Get Book by ID:
GET http://localhost:8080/api/books/{bookId}

Database Access
This application uses H2 in-memory database for development.:

H2 Console URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: 


