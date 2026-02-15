# MindList 🌿

> A clean and simple task management application built with Spring Boot

MindList helps you organize your daily tasks with a beautiful interface. Create, edit, and track your todos with secure user authentication.

---

## Features

- **User Authentication** - Secure login and registration with encrypted passwords
- **Task Management** - Create, update, delete, and mark tasks as complete
- **Real-time Statistics** - See your total, active, and completed tasks at a glance
- **Smart Filtering** - Filter tasks by All, Active, or Completed
- **Inline Editing** - Click on any task to edit it directly
- **Keyboard Shortcuts** - Quick actions with keyboard commands
- **Responsive Design** - Works perfectly on desktop, tablet, and mobile

---

## Tech Stack

**Backend:**
- Java 17
- Spring Boot 3.2.0
- Spring Security (for authentication)
- Spring Data JPA (for database)
- MySQL 8.0

**Frontend:**
- Thymeleaf (HTML templates)
- CSS3 (styling)
- JavaScript (interactions)

---

## How It Works

1. **Register/Login** - Create an account or login with your credentials
2. **Add Tasks** - Type your task and press Enter or click Add
3. **Manage Tasks** - Click to edit, mark complete, or delete tasks
4. **Filter Tasks** - Use tabs to view all, active, or completed tasks
5. **Track Progress** - See your statistics update in real-time

---

## Architecture

```
┌─────────────────────┐
│   Controllers       │  ← Handle web requests
│   (Presentation)    │
└─────────────────────┘
          ↓
┌─────────────────────┐
│    Services         │  ← Business logic
│   (Business)        │
└─────────────────────┘
          ↓
┌─────────────────────┐
│   Repositories      │  ← Database operations
│     (Data)          │
└─────────────────────┘
```

**Simple Explanation:**
- **Controllers** - Receive your requests (like "add task")
- **Services** - Process the request (validate, apply rules)
- **Repositories** - Save/retrieve data from database

---

## Getting Started

### Prerequisites
- Java 17
- MySQL 8.0 or higher

### Installation

1. **Clone the project**
   ```bash
   git clone https://github.com/harshaadeshmukh/MindList.git
   cd MindList
   ```

2. **Setup database**
   ```sql
   CREATE DATABASE mindlist_db;
   ```

3. **Configure database**
   
   Open `src/main/resources/application.properties` and update:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/mindlist_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

5. **Open in browser**
   ```
   http://localhost:8080
   ```

That's it! You're ready to go! 🚀

---

## Use Cases

- **Personal Todo List** - Manage your daily tasks and track what's done
- **Project Planning** - Break down projects into smaller tasks
- **Study Organization** - Keep track of assignments and homework
- **Habit Tracking** - Monitor daily habits and routines
- **Team Tasks** - Each user has their own private task list

---

## Project Structure

```
MindList/
├── src/main/java/
│   ├── controller/     # Handles web requests
│   ├── services/       # Business logic
│   ├── models/         # Data models (User, Task)
│   ├── repository/     # Database access
│   └── config/         # Security configuration
│
├── src/main/resources/
│   ├── templates/      # HTML pages
│   └── application.properties
│
└── pom.xml            # Dependencies
```

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/` | Task dashboard (main page) |
| POST | `/` | Add new task |
| POST | `/{id}/update` | Update task |
| GET | `/{id}/toggle` | Mark complete/incomplete |
| GET | `/{id}/delete` | Delete task |
| GET | `/login` | Login page |
| POST | `/login` | Process login |
| GET | `/register` | Registration page |
| POST | `/register` | Create account |
| POST | `/logout` | Logout |

---

## Screenshots

### Main Dashboard
- View all your tasks
- See statistics (Total, Active, Completed)
- Filter tasks easily

### Login & Register
- Secure authentication
- Password strength indicator
- Beautiful gradient design

---

## Security Features

✅ Passwords are encrypted (never stored as plain text)  
✅ CSRF protection on all forms  
✅ Session-based authentication  
✅ Protected routes (login required)  

---

## Author

**Harshad Deshmukh**

- 🌐 [Portfolio](https://harshaadeshmukh.netlify.app)
- 💻 [GitHub](https://github.com/harshaadeshmukh)

---

## License

MIT License - feel free to use this project for learning!

---

<div align="center">

Made with ❤️ by Harshad Deshmukh

⭐ Star this repo if you found it helpful!

</div>
