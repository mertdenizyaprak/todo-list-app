Description
This project is a Todo List Application built using Spring Boot. It provides basic functionality to manage tasks, including adding, updating, and deleting todos. The application leverages a PostgreSQL database for data storage, and it uses DBeaver as the database management tool to manage and interact with the PostgreSQL database.

The project was initialized using the Spring Boot Initializer to quickly set up a skeleton application, including necessary dependencies and configurations.

Tools and Technologies Used
Spring Boot: The framework for building the application, which simplifies the development of Java-based applications and microservices.
PostgreSQL: A powerful, open-source relational database used to store and manage data.
DBeaver: A universal database management tool that was used to connect to and manage the PostgreSQL database. It provides an intuitive interface for interacting with the database and managing tables, queries, and schemas.
Postman: A tool used for testing and interacting with the REST APIs of the application. Postman allows easy testing of the HTTP requests and responses, ensuring the application behaves as expected.
Project Initialization
The project was initialized using the Spring Boot Initializer, a web-based tool that helps developers create a Spring Boot project with predefined configurations. This tool automatically sets up the necessary dependencies, configurations, and file structures for the project.

How to Run
Clone the repository to your local machine.
Open the project in your preferred IDE (such as IntelliJ IDEA or Eclipse).
Ensure that you have PostgreSQL installed and running locally.
Configure the application.properties or application.yml file with your PostgreSQL database connection details.
Run the application with the command mvn spring-boot:run or directly through your IDE.
Test the application using Postman by sending requests to the API endpoints.
Database Configuration
The project uses a PostgreSQL database, and DBeaver is used for managing the database schema and data. The connection details to the database are configured in the application.properties file.
