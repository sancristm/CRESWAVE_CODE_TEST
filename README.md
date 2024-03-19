Blogging Platform
<br>
A RESTful API for a blogging platform built with Java and Spring Boot.

Table of Contents
Introduction
Features
Technologies Used
Setup
Usage
API Endpoints
Contributing
License
Introduction
This project is a blogging platform that provides users with the ability to register, login, manage their profiles, create, read, update, and delete blog posts, comment on blog posts, and perform search functionality to search for blog posts by title or content. It also implements role-based access control (RBAC) where only authorized users can perform certain actions.

Features
User registration and authentication
User profile management
CRUD operations for blog posts
Commenting on blog posts
Role-based access control (RBAC)
Pagination and sorting for blog posts and comments
Search functionality for blog posts by title or content
Technologies Used
Java
Spring Boot
Spring Security
Spring Data JPA
PostgreSQL (or your preferred database)
Maven (or Gradle)
Setup
Clone the repository:

bash
Copy code
git clone https://github.com/sancristm/CRESWAVE_CODE_TEST.git
Navigate to the project directory:

bash
Copy code
cd CRESWAVE_CODE_TEST
Configure your database settings in application.properties.

Build the project:

bash
Copy code
mvn clean package
Run the application:

bash
Copy code
java -jar CRESWAVE_CODE_TEST.jar
Usage
Once the application is running, you can interact with the API using tools like Postman or cURL. You can register users, login, create blog posts, comment on blog posts, etc. See the API Endpoints section for details on available endpoints and their usage.

API Endpoints
User Registration: POST api/v1/user/register
User Login: POST  api/v1/user/login  //to be implimented 
Blog Posts:
GET /api/v1/blogs/ Retrieve all blog posts
GET /api/V1/posts/{BlogpostId}: Retrieve a specific blog post by ID
POST /api/V1/blogs: Create a new blog post
PUT /api/V1/posts/{BlogpostId}: Update an existing blog post
DELETE /api/v1/blogs/{BlogpostId}: Delete a blog post
Comments:
GET /api/v1/comments/: Retrieve all comments
GET /api/v1/comments/{id}: Retrieve a specific comment by ID
POST /api/v1/ comments: Create a new comment
PUT /api/v1/comments/{id}: Update an existing comment
DELETE /api/v1/comments/{id}: Delete a comment
Contributing
Contributions are welcome! Please follow the Contribution Guidelines.

License
This project is licensed under the MIT License.
