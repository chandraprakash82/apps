# splunk-logging
#### **Overview**

This proof of concept (PoC) demonstrates how to integrate Splunk for logging in a Spring Boot application. The goal is to showcase how to send application logs to Splunk for centralized logging, monitoring, and analysis.

#### **Features**

Spring Boot: Leverage Spring Boot for rapid application development.

Splunk Logging: Utilize the Splunk HTTP Event Collector (HEC) to send logs from the application.

Structured Logging: Implement structured logging for better organization and searchability of log data.

Logging Levels: Use various logging levels (INFO, DEBUG, ERROR) to capture different types of information.

#### **Architecture**

Spring Boot Application: The main application that handles business logic and logging.

Splunk: Centralized logging platform that receives and analyzes log data from the application.

#### **Prerequisites**

Java 17+

A running Splunk instance with the HTTP Event Collector (HEC) enabled

Maven or Gradle for dependency management