# event-sourcing
#### **Overview**

This proof of concept (PoC) demonstrates the implementation of event sourcing using Apache Kafka as the event store. The goal is to illustrate how event-driven architectures can be built to maintain a reliable and scalable system.

#### **Features**

Event Sourcing: Capture changes to the application state as a sequence of events.

Kafka: Use Apache Kafka for reliable event streaming and storage.

Microservices: Showcase a sample application composed of multiple microservices that communicate through events.

#### **Architecture**

Producers: Microservices that generate events and publish them to Kafka topics.

Kafka: Acts as the backbone for event storage and distribution.

Consumers: Microservices that subscribe to Kafka topics to process events.

#### **Prerequisites**

Java 17+

Apache Kafka installed or a Kafka cluster (e.g., Confluent Cloud)

Maven or Gradle for dependency management