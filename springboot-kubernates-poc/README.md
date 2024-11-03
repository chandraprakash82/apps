# springboot-k8s-example

#### Overview

This proof of concept (PoC) showcases the deployment of a Spring Boot application on a Kubernetes cluster. The goal is to demonstrate how to containerize the application using Docker and orchestrate its deployment using Kubernetes, ensuring scalability and manageability.

#### Features

Spring Boot: Leverage Spring Boot for rapid application development.

Docker Containerization: Package the Spring Boot application as a Docker container.

Kubernetes Deployment: Deploy the containerized application on a Kubernetes cluster.

Service Management: Expose the application through Kubernetes services for internal and external access.

Scaling and Health Checks: Utilize Kubernetes features for scaling the application and performing health checks.

#### Architecture

Spring Boot Application: The main application that will be containerized and deployed.

Docker: Used for creating the container image of the Spring Boot application.

Kubernetes: The orchestration platform used for deploying, managing, and scaling the application.

#### Prerequisites

Java 11+
Docker installed on your local machine

Kubernetes cluster (e.g., Minikube, EKS, GKE, AKS)

kubectl command-line tool configured to interact with your Kubernetes cluster