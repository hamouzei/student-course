# REST Controller & CRUD APIs

## API Endpoints

| Method | Endpoint           | Description          |
| ------ | ------------------ | -------------------- |
| POST   | /api/students      | Create a new student |
| GET    | /api/students      | Get all students     |
| GET    | /api/students/{id} | Get a student by ID  |
| PUT    | /api/students/{id} | Update a student     |
| DELETE | /api/students/{id} | Delete a student     |

---

# HTTP Methods Explained

**GET**
Used to retrieve data from the server.

**POST**
Used to create new data.

**PUT**
Used to update existing data.

**DELETE**
Used to remove data.

---

# Status Codes

| Code           | Meaning                           |
| -------------- | --------------------------------- |
| 200 OK         | Request successful                |
| 201 Created    | New resource created successfully |
| 204 No Content | Resource deleted successfully     |
| 404 Not Found  | Resource does not exist           |

---

# Concepts Learned

**REST Principles**
REST is a way to design APIs using HTTP and clear resource paths.

**HTTP Verbs**
Operations like GET, POST, PUT, and DELETE represent actions on resources.

**ResponseEntity**
Used to control HTTP responses such as status codes and returned data.

**Status Codes**
HTTP responses include codes to indicate the result of the request.
