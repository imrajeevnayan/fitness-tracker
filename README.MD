# 🏋️‍♂️ Fitness Tracker App
🏃‍♂️ A modern, full-stack fitness tracking application built with Spring Boot, PostgreSQL, and Tailwind CSS. Track your workouts, monitor progress, and maintain a healthy lifestyle with a clean, responsive interface.

[![Build Status](https://img.shields.io/badge/build-passing-success-green.svg)](https://github.com/imrajeevnayan/fitness-tracker/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0.2-green.svg)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue.svg)](https://www.postgresql.org/)

---

## 🌟 Key Features
✨ Core Functionality:
- 📝 Log detailed workouts with exercises, sets, reps, and weight
- 📊 Track real-time workout progress
- 📈 View historical workout data
- 📱 Responsive design for all devices

✨ Technical Features:
- 💡 Clean, modern UI with Tailwind CSS
- 🔄 RESTful API with Spring Boot
- 🗃️ Robust data persistence using PostgreSQL
- 📊 Real-time progress updates
- ✅ Easy deployment and maintenance

---

## 🧰 Tech Stack
| Layer         | Technology                    | Version |
| ------------- | ----------------------------- | ------- |
| Backend       | Java 21, Spring Boot          | 3.0.2   |
| Frontend      | HTML5, Tailwind CSS           | 3.2.4   |
| Database      | PostgreSQL                    | 15      |
| Build Tool    | Maven                         | 3.9.0   |
| IDE (Optional)| IntelliJ IDEA (Community)     | 2023.1  |

---

## 📁 Project Structure
```markdown
fitness-tracker/
├── src/
│   ├── main/
│   │   ├── java/com/example/fitnesstracker/
│   │   │   ├── controller/         # API Controllers
│   │   │   ├── model/              # JPA Entities
│   │   │   ├── repository/         # Spring Data JPA Repositories
│   │   │   └── FitnessTrackerApp.java  # Main class
│   │   └── resources/
│   │       ├── static/index.html   # Frontend (UI)
│   │       ├── application.properties
│   │       └── ...
├── pom.xml
└── README.md
```

---

## ⚙️ Getting Started
### Prerequisites
- Java 21
- PostgreSQL 15
- Maven 3.9.0
- Node.js (for frontend development)

### 1. Clone the Repository
```bash
git clone https://github.com/imrajeevnayan/fitness-tracker.git
cd fitness-tracker
```

### 2. Set Up PostgreSQL
Create a PostgreSQL database:
```sql
CREATE DATABASE fitness_tracker;
```

Update your `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/fitness_tracker
spring.datasource.username=postgres
spring.datasource.password=your_db_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Build and Run
Using Maven:
```bash
./mvnw spring-boot:run
```

Or using IntelliJ:
```bash
# Import as Maven project
# Select JDK 21
# Click Run
```

---

## 📦 REST API Documentation
### Endpoints
| Method | Endpoint                 | Description          | Request Body |
| ------ | ------------------------ | -------------------- | ------------ |
| POST   | `/api/workouts/log`      | Log a new workout    | ✓            |
| GET    | `/api/workouts/progress` | Get all workout logs | -            |

### Example Request
```json
POST /api/workouts/log HTTP/1.1
Content-Type: application/json

{
  "exercise": "Push-ups",
  "sets": 3,
  "reps": 15,
  "weight": 0,
  "date": "2025-01-01"
}
```

### Example Response
```json
HTTP/1.1 201 Created
Content-Type: application/json

{
  "id": 1,
  "exercise": "Push-ups",
  "sets": 3,
  "reps": 15,
  "weight": 0,
  "date": "2025-01-01",
  "createdAt": "2025-01-01T12:00:00Z"
}
```

---

## 💼 Why This Project? (Recruiter View)
🎯 Technical Demonstrations:
- Full-stack development with modern technologies
- Clean architecture and project structure
- RESTful API design and implementation
- Database modeling and JPA usage
- Frontend-backend integration

📈 Professional Skills:
- Project organization and documentation
- API design and documentation
- Version control best practices
- Testing and deployment considerations
- Code quality and maintainability

---

## 📈 Performance Considerations
- Database indexing for efficient queries
- Caching strategy for frequent operations
- API rate limiting for scalability
- Error handling and logging
- Security best practices

---

## 📌 Future Improvements
- User authentication with Spring Security
- Mobile responsiveness enhancements
- Analytics dashboard for progress
- Cloud deployment (Render/Heroku/Railway)
- Social features for workout sharing

---

## 🧑‍💻 Author
Made with 💪 by **RAJEEV NAYAN**
[LinkedIn](https://linkedin.com/in/imrajeevnayan) | [GitHub](https://github.com/imrajeevnayan)

---

## 📝 License
MIT License

Copyright (c) 2025 RAJEEV NAYAN
copies or substantial portions of the Software.
