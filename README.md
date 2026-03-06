# Student Course System

## Project Name

Student Course System

---

## Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Maven
* Validation

---

## Database Configuration

Database name:

```
student_course_db
```

Database configuration is located in:

```
src/main/resources/application.properties
```

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_course_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

---

## Folder Structure

```
src/main/java/com/studentcourse
│
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
├── config
│
└── StudentCourseSystemApplication.java
```

---

## How to Run the Project

### 1. Clone the repository

```
git clone <repository-url>
```

### 2. Navigate to the project directory

```
cd student-course-system
```

### 3. Create the database

Run this command in MySQL:

```sql
CREATE DATABASE student_course_db;
```

### 4. Configure database credentials

Open:

```
src/main/resources/application.properties
```

Update the username and password according to your MySQL setup.

---

### 5. Run the application

Run the main file:

```
StudentCourseSystemApplication.java
```

Or use Maven:

```
mvn spring-boot:run
```

---


