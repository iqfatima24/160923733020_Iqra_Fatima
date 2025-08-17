Overview

This is a Spring Boot REST API for managing tasks using an HashMap instead of a database. It supports basic CRUD operations: Create, Read, Update, and Delete.

Instructions to Run the Project

Clone or download the project.

Open the project in IntelliJ IDEA, Eclipse, or VS Code (with Java support).

Ensure you have:

1.Java 11 or above installed

Maven installed
JSON SAMPLE { "title": "Write API Documentation", "description": "Prepare README for the Task Manager project", "status": "TO_DO" }

POST REQUEST POST http://localhost:8080/tasks

GET BY ID REQUEST GET http://localhost:8080/tasks/{id}

GET ALL REQUEST GET http://localhost:8080/tasks

PUT REQUEST PUT http://localhost:8080/tasks/{id}

DELETE REQUEST DELETE http://localhost:8080/tasks/{id}
