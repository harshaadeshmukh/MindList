# 🎯 MindList

A beautiful and intuitive todo application built with Spring Boot. Keep your life simple and organized with a modern, gradient-designed interface.

## ✨ Features

- ✏️ **Edit Tasks** - Update task titles with inline editing
- ✅ **Task Management** - Add, edit, complete, and delete tasks
- 📱 **Responsive** - Works perfectly on desktop, tablet, and mobile
- 💾 **MySQL Database** - Reliable persistent storage for all tasks

## 🖼️ Preview
<img src="image.png" alt="MindList UI" width="800"/>

## 🚀 Installation

```bash
# Clone the repository
git clone https://github.com/harshaadeshmukh/MindList.git
cd MindList

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

Open your browser and go to `http://localhost:8080`

## 🛠️ Tech Stack

| Category | Technology |
|----------|------------|
| **Framework** | Spring Boot 3.x |
| **ORM** | Spring Data JPA |
| **Database** | MySQL |
| **Build Tool** | Maven |
| **Boilerplate Reduction** | Lombok |
| **Template Engine** | Thymeleaf |
| **CSS Framework** | Bootstrap 5 |
| **Styling** | CSS3 (Custom animations) |
| **Fonts** | Google Fonts |


## 📌 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/` | Display all tasks |
| POST | `/` | Create new task |
| POST | `/{id}/update` | Update task title |
| GET | `/{id}/toggle` | Toggle task completion |
| GET | `/{id}/delete` | Delete task |

---

⭐ Star this repo if you find it helpful!
