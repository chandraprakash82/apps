# springboot-mongodb-docker

#### Overview

This proof of concept (PoC) demonstrates the integration of MongoDB with a Spring Boot application, both containerized using Docker. The goal is to showcase how to develop, run, and manage a full-stack application with a NoSQL database in a microservices architecture.

#### Features

Spring Boot: Utilize Spring Boot for rapid application development.

MongoDB: Use MongoDB as the NoSQL database for storing application data.

Docker Containerization: Package both the Spring Boot application and MongoDB in Docker containers for easy deployment and management.

Docker Compose: Use Docker Compose to orchestrate the containers and define the services.

#### Architecture

Spring Boot Application: The main application that handles business logic and interacts with MongoDB.

MongoDB: A NoSQL database used for data storage, running in its own container.

Docker: The platform used for containerizing and running the application and database.

#### Prerequisites

Docker and Docker Compose installed on your machine.

Java 11+ (for local development, if needed).