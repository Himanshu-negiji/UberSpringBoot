Driving App (Uber-like Application)
Overview
This project is a distributed microservice system designed to power an Uber-like application, focusing on real-time location tracking, driver management, and secure communication between services. The architecture is built with scalability, maintainability, and high performance in mind.

Features
Microservice Architecture: The system is architected using a distributed microservice approach with Spring Boot and various Spring ecosystem projects, ensuring scalability and separation of concerns.

Real-time Location Tracking:

Implemented a dedicated Location Service using Redis to handle real-time driver location updates and nearby driver retrieval.
Optimized for low-latency data handling, providing seamless and efficient real-time tracking.
Event-Driven Architecture:

Asynchronous communication between services is handled by Apache Kafka, ensuring scalability and fault tolerance.
Retrofit is used for asynchronous API calls between microservices, enhancing the efficiency of inter-service communication.
Security:

JWT-based authentication with Spring Security ensures robust access control across services, providing secure handling of user sessions and API calls.
Service Discovery and Load Balancing:

Eureka is integrated for dynamic service discovery and load balancing, allowing services to register dynamically and ensuring high availability and reliability.
Technologies Used
Spring Boot: For building microservices and handling REST API calls.
Redis: For real-time location updates and data storage.
Apache Kafka: For asynchronous messaging and event-driven architecture.
Retrofit: For making asynchronous HTTP requests between microservices.
Spring Security (JWT): For securing the services with token-based authentication.
Eureka: For service discovery and load balancing.
