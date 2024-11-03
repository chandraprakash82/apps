# lookup-injection
#### **Overview**

This proof of concept (PoC) demonstrates the concept of lookup injection in Spring Boot. Lookup injection allows for dynamic retrieval of a bean, enabling flexibility in the application design by injecting a different instance of a bean each time it is needed.

#### **Features**

Spring Boot: Utilizes the Spring Boot framework for easy configuration and rapid development.

Lookup Injection: Showcases how to use the @Lookup annotation to retrieve prototype-scoped beans from a singleton-scoped bean.

Dynamic Behavior: Demonstrates dynamic behavior by providing different instances of a bean when needed.

#### **Architecture**

Singleton Bean: A singleton bean that uses lookup injection to obtain instances of prototype beans.

Prototype Bean: A prototype bean that is instantiated anew each time it is requested.

Prerequisites

Java 17+
Maven or Gradle for dependency management