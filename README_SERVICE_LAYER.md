# Service Layer Documentation

## Why Service Layer Is Important

The **service layer** contains the business logic of the application.
It keeps the controller simple and separates application rules from database operations.

Benefits:

* Keeps code clean and organized
* Makes the system easier to maintain
* Allows controllers to focus only on handling requests

---

## Difference Between Repository and Service

| Layer      | Responsibility                                             |
| ---------- | ---------------------------------------------------------- |
| Repository | Communicates directly with the database                    |
| Service    | Contains business logic and controls how data is processed |

Repository performs database operations like saving or retrieving data, while the service decides **when and how those operations should happen**.

---

## Business Rules Implemented

The service layer enforces the following rules:

1. **Email must be unique**
   A student cannot be created if the email already exists.

2. **Student must exist for operations**
   When searching, updating, or deleting a student, the system throws an exception if the student is not found.

These rules ensure data integrity and proper application behavior.
