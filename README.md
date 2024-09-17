# Driving App (Uber-like Application)

## Overview
This project is a distributed microservice system designed for an Uber-like application. It provides real-time location tracking, driver management, and secure communication between services. The architecture focuses on scalability, maintainability, and high performance, utilizing modern technologies in the Spring ecosystem.

## Features
- **Microservice Architecture**: 
  - Built using Spring Boot and other Spring projects, ensuring modularity and scalability.

- **Real-time Location Tracking**: 
  - Location Service developed with Redis for real-time updates and nearby driver retrieval.
  - Optimized for low-latency and efficient data handling, ensuring a seamless user experience.

- **Event-Driven Architecture**: 
  - Integrated with Apache Kafka for asynchronous communication between services, improving fault tolerance and scalability.
  - Utilizes Retrofit for efficient asynchronous API calls between microservices.

- **Advanced Security**: 
  - Implemented JWT-based authentication using Spring Security, providing secure access control across microservices.

- **Service Discovery and Load Balancing**: 
  - Eureka is used for service discovery and load balancing, enabling dynamic service registration and improving system reliability.

## Technologies Used
- **Spring Boot**: For creating scalable and modular microservices.
- **Redis**: For handling real-time driver location updates and storage.
- **Apache Kafka**: For asynchronous event-driven communication.
- **Retrofit**: For making asynchronous HTTP requests between services.
- **Spring Security (JWT)**: For secure authentication and authorization across services.
- **Eureka**: For service discovery and load balancing.

## Schema View
  Booking Schema - <img width="1372" alt="Screenshot 2024-09-17 at 4 00 39 PM" src="https://github.com/user-attachments/assets/61e4432a-05d3-4e58-9a42-d52dfa524a59">
  Driver Schema - <img width="1358" alt="Screenshot 2024-09-17 at 4 01 54 PM" src="https://github.com/user-attachments/assets/9e9033ce-fa0f-4ebb-b0a9-7fd7dc54fcdd">
  Passenger Schema - <img width="1379" alt="Screenshot 2024-09-17 at 4 02 28 PM" src="https://github.com/user-attachments/assets/7c43639a-9f5a-47be-bb0a-cb982ae4ad50">
  Driver Location Schema - <img width="617" alt="Screenshot 2024-09-17 at 4 03 19 PM" src="https://github.com/user-attachments/assets/f213d4dc-46d0-4471-9fef-0e064ba5ff12">

