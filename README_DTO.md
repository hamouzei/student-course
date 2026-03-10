# Day 5 — DTO, Validation & Global Exception Handling

## Why DTO is Important

DTO (Data Transfer Object) is used to control the data that comes into the API.

Benefits:

* Prevents exposing internal database entities
* Allows validation before data reaches the business logic
* Keeps API requests clean and structured

---

# Difference Between Entity and DTO

| Type   | Purpose                                       |
| ------ | --------------------------------------------- |
| Entity | Represents a database table                   |
| DTO    | Represents data sent by the client to the API |

Example:

* **Student Entity** → stored in the database
* **StudentRequestDTO** → used to receive API request data

---

# Validation Annotations

Validation annotations ensure incoming data is correct.

**@NotBlank**
Field must not be empty.

**@Email**
Field must contain a valid email format.

**@Min(18)**
Value must be at least 18.

These validations run automatically before the controller processes the request.

---

# Global Exception Flow

```
Client Request
      │
      ▼
DTO Validation
      │
      ▼
Validation Error Detected
      │
      ▼
GlobalExceptionHandler
      │
      ▼
Formatted Error Response
```

Example Error Response:

```
{
 "timestamp": "...",
 "status": 400,
 "errors": [
   "First name must not be blank",
   "Email must be valid",
   "Age must be at least 18"
 ]
}
```
