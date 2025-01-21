# University Management System

The **University Management System** is a comprehensive web application built using the Spring Framework. It is designed to manage various aspects of a university's administrative and academic operations. The application facilitates the management of students, instructors, courses, and grading systems, along with planning and assigning responsibilities. It includes robust validation mechanisms to ensure data integrity.

## Features

### 1. **User Registration**
- Students and instructors can register accounts in the system.
- User profiles store essential information such as name, contact details, and roles (Student/Instructor).

### 2. **Course Planning**
- Facilitates the creation and management of courses.
- Instructors can plan and schedule courses, including topics, dates, and other relevant details.

### 3. **Grading System**
- A comprehensive grading mechanism allows instructors to assign grades to students.
- Supports different grading scales (numeric, letter grades) based on course requirements.

### 4. **Course Assignments**
- Instructors are assigned to courses.
- Students can be enrolled in courses based on their study programs.

### 5. **Instructor-Student Assignments**
- Instructors are assigned to individual students or groups for mentorship or class instruction.

### 6. **Validation System**
- Built-in validation ensures that only valid data is entered.
- The system validates student grades, course schedules, and user registration details.

## Technologies Used

- **Spring Boot**: Framework for building the application.
- **spring-boot-starter-data-jpa**: Simplifies database access and ORM functionality.
- **spring-boot-starter-web**: Provides tools for building RESTful web services.
- **spring-boot-starter-validation**: Enables data validation.
- **spring-boot-starter**: Core library for Spring Boot applications.
- **spring-boot-starter-test**: Used for testing the application.
- **MySQL**: Relational database management system for persistent data storage.
- **Lombok**: Reduces boilerplate code by generating getters, setters, and constructors.
- **MapStruct**: Simplifies object mapping and data transformation.
- **SpringDoc OpenAPI**: Automatically generates interactive API documentation.
- **Java**: Version 17 or higher.
- **Maven or Gradle**: For dependency management.
- **IDE**: Such as IntelliJ IDEA.
