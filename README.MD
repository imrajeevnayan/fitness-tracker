# 🏋️ Fitness Tracker App

A simple and modern **Fitness Tracker** web application built with **Spring Boot**, **PostgreSQL**, and **Tailwind CSS**. Users can log workouts, view their progress, and manage their fitness activities — all from a clean, responsive UI.

---

## 🚀 Features

- 📝 Log workouts (exercise, sets, reps, weight)
- 📊 View real-time workout progress
- 💡 Simple UI using HTML + Tailwind CSS
- 🔄 Backend REST API with Spring Boot
- 🗃️ Data persistence using PostgreSQL
- ✅ Easy to run and deploy

---

## 🧰 Tech Stack

| Layer         | Technology                    |
| ------------- | ----------------------------- |
| Backend       | Java 21, Spring Boot          |
| Frontend      | HTML5, Tailwind CSS           |
| Database      | PostgreSQL                    |
| Build Tool    | Maven                         |
| IDE (Optional)| IntelliJ IDEA (Community)     |

---

## 📁 Project Structure

```

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

````

---

## ⚙️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/imrajeevnayan/fitness-tracker.git
cd fitness-tracker
````

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

> 💡 Make sure PostgreSQL is running.

---

### 3. Build the Project

If using **IntelliJ**:

- Open the project
- Make sure JDK 21 is selected
- Click **Run**

Or using terminal:

```bash
./mvnw spring-boot:run
```

---

### 4. Access the App

Open your browser:

```
http://localhost:8080
```

You’ll see the fitness tracker UI where you can:

- Log a workout
- View progress instantly (loaded from the backend)

---

## 📦 REST API Overview

| Method | Endpoint                 | Description          |
| ------ | ------------------------ | -------------------- |
| POST   | `/api/workouts/log`      | Log a new workout    |
| GET    | `/api/workouts/progress` | Get all workout logs |

Example Request:

```json
POST /api/workouts/log
{
  "exercise": "Push-ups",
  "sets": 3,
  "reps": 15,
  "weight": 0
}
```

---

## 💼 Why This Project? (Recruiter View)

- ✅ Demonstrates **full-stack skills** (HTML + REST API + DB)
- ✅ Uses **clean project structure** and modern stack
- ✅ Includes **data persistence** (PostgreSQL with JPA)
- ✅ Well-documented, readable, and extendable
- ✅ Designed for **real-world usability**

> This project highlights core backend development skills and the ability to connect UI with RESTful services using industry-standard practices.

---

## 📌 Future Improvements (Optional)

- 🧑‍🤝‍🧑 User authentication with Spring Security
- 📱 Mobile responsiveness enhancements
- 📈 Analytics dashboard for progress
- 🌐 Host the app on Render / Heroku / Railway

---

## 🧑‍💻 Author

Made with 💪 by **RAJEEV NAYAN**
[LinkedIn](https://linkedin.com/in/imrajeevnayan) | [GitHub](https://github.com/imrajeevnayan)

---

## 📝 License

 
 

