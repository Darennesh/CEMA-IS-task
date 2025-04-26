Health Info System-A simple Spring Boot application for managing patients and their program enrollments.
Doctors can search for patients, view full profiles, and expose patient data via APIs for integration with other systems.

Features:
Register and manage patients.
Doctors can search patients by name.
View full patient profiles (including enrolled programs).
Expose REST APIs for other systems to retrieve patient information.
Built with Spring Boot 3, Spring Data JPA, and PostgreSQL.

Tech Tools
Java 17
Spring Boot 3.4.5
Spring Web
Spring Data JPA
PostgreSQL
HikariCP (Connection Pool)

Process:
1. Clone the Repository
bash
Copy
Edit
git clone https://github.com/your-username/health-info-system.git
cd health-info-system
2. Set up the Database
Create a PostgreSQL database, e.g., health_info_system.
Update your application.properties:
properties
Copy
Edit
spring.datasource.url=jdbc:postgresql://localhost:5432/health_info_system
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
3. Run the Application
bash
Copy
Edit
mvn spring-boot:run
Application starts on http://localhost:8080.

API Endpoints

Method	Endpoint	Description
GET	/api/patients/search?name=John	Search patients by name
GET	/api/patients/{id}	Get full patient profile by ID
➡ Swagger UI
Once running, visit:
bash
Copy
Edit
http://localhost:8080/swagger-ui/index.html
Project Structure
css
Copy
Edit
HealthInfoSystem/src/main/java/com/example/HealthInfoSystem/
controller/
PatientController.javamodel/
Patient.java
Program.j
repository/
PatientRepository.java
HealthInfoSystemApplication.java
src/main/resources/
application.properties
pom.xml
README.md
