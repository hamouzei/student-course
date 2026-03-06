# Student Course System

## ER Diagram

Simple structure of the **students** table.

```
+------------------+
|     students     |
+------------------+
| id (PK)          |
| first_name       |
| last_name        |
| email (UNIQUE)   |
| age              |
+------------------+
```

PK = Primary Key (unique ID for each student)

---

# JPA Annotations Used

**@Entity**
Marks the class as a database table.

**@Table(name = "students")**
Sets the name of the table in the database.

**@Id**
Defines the primary key of the table.

**@GeneratedValue**
Automatically generates the ID value.

**@Column(unique = true)**
Ensures the email value is unique.

---

# How Hibernate Auto-Creates Tables

Hibernate reads the **Entity classes** and creates tables automatically in the database.

This works because of this setting:

```
spring.jpa.hibernate.ddl-auto=update
```

When the application starts:

1. Spring Boot starts.
2. Hibernate scans for `@Entity` classes.
3. It finds the `Student` entity.
4. Hibernate creates the `students` table in the database if it does not exist.
