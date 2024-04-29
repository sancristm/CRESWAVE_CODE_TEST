# Blogging Platform

A RESTful API for a blogging platform built with Java and Spring Boot.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project is a blogging platform that provides users with the ability to register, login, manage their profiles, create, read, update, and delete blog posts, comment on blog posts, and perform search functionality to search for blog posts by title or content. It also implements role-based access control (RBAC) where only authorized users can perform certain actions.

## Features

- User registration and authentication
- User profile management
- CRUD operations for blog posts
- Commenting on blog posts
- Role-based access control (RBAC)
- Pagination and sorting for blog posts and comments
- Search functionality for blog posts by title or content

## Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL (or your preferred database)
- Maven (or Gradle)

## Setup

1. Clone the repository

```bash
git clone https://github.com/sancristm/CRESWAVE_CODE_TEST.git

2. Navigate to the project directory

``` bash
cd CRESWAVE_CODE_TEST

3. Configure your database settings in application.properties.

4. Build the project

``` bash
mvn clean package
5. Run the Application
```bash
java -jar CRESWAVE_CODE_TEST.jar



