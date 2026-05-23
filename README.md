Skill Review System
📌 Overview

This project is a Spring Boot RESTful API developed for managing a skill review system.
It demonstrates a clean backend architecture using Spring Boot, Spring Data JPA, and layered design principles.

The system allows management of users, products, and job listings, and includes basic search and filtering functionalities.

🎯 Project Purpose

The goal of this project is to practice and demonstrate:

Backend API development using Spring Boot
Layered architecture (Controller, Service, Repository)
CRUD operations on multiple entities
RESTful API design principles
Database integration using MySQL
🧱 System Architecture

The application follows a standard 3-layer architecture:

1. Controller Layer

Handles incoming HTTP requests and returns responses.

UserController
ProductController
JobListingController
2. Service Layer

Contains business logic and processes data before sending it to controllers.

UserService
ProductService
JobListingService
3. Repository Layer

Handles database operations using Spring Data JPA.

UserRepository
ProductRepository
JobListingRepository
📦 Core Modules
👤 User Management
Create user
Retrieve users
Delete user
📦 Product Management
Create product
Update product
Delete product
Search product by keyword
Filter by category
Filter by published status
💼 Job Listing Management
Create job listing
Retrieve job listings
Update job listing
Delete job listing
🛠️ Technologies Used
Java 17 / Java 21
Spring Boot
Spring Web
Spring Data JPA
Hibernate
MySQL
Maven
📁 Project Structure
com.ousmane.skillReview
│
├── controller
├── service
├── repository
├── entity
└── SkillReviewApplication.java
