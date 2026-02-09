<div align="center">

# 🎯 MindList

### *Keep Life Simple & Organized*

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white" alt="Thymeleaf"/>
  <img src="https://img.shields.io/badge/Bootstrap-5.3-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white" alt="Bootstrap"/>
</p>

<p align="center">
  <img src="https://img.shields.io/github/license/harshaadeshmukh/MindList?style=flat-square" alt="License"/>
  <img src="https://img.shields.io/github/stars/harshaadeshmukh/MindList?style=flat-square" alt="Stars"/>
  <img src="https://img.shields.io/github/forks/harshaadeshmukh/MindList?style=flat-square" alt="Forks"/>
  <img src="https://img.shields.io/github/issues/harshaadeshmukh/MindList?style=flat-square" alt="Issues"/>
</p>

<p align="center">
A beautiful, modern todo application with an elegant gradient UI, intuitive click-to-edit functionality, and seamless user experience. Built with Spring Boot and designed to make task management delightful.
</p>

<p align="center">
  <a href="#-features">Features</a> •
  <a href="#-demo">Demo</a> •
  <a href="#-quick-start">Quick Start</a> •
  <a href="#-tech-stack">Tech Stack</a> •
  <a href="#-documentation">Documentation</a> •
  <a href="#-contributing">Contributing</a>
</p>

</div>

---

## ✨ Features

<table>
<tr>
<td width="50%">

### 🎨 Beautiful Design
- Stunning gradient background with floating animations
- Modern glassmorphism card design
- Smooth transitions and micro-interactions
- Custom favicon with brand colors
- Responsive layout for all devices

</td>
<td width="50%">

### 🚀 Smart Functionality
- **Click-to-Edit** - Edit tasks by clicking on titles
- **Keyboard Shortcuts** - Enter to save, ESC to cancel
- **Real-time Updates** - Instant task completion toggle
- **Persistent Storage** - All tasks saved in database
- **Mobile Optimized** - Touch-friendly interface

</td>
</tr>
</table>

### 🎯 Key Highlights

- ✏️ **Intuitive Editing** - Click any task title to edit inline
- 🎭 **Visual Feedback** - Hover effects, animations, and state indicators
- 📱 **Fully Responsive** - Works seamlessly on desktop, tablet, and mobile
- ⚡ **Lightning Fast** - Optimized Spring Boot backend
- 🎨 **Customizable** - Easy-to-modify color schemes and fonts
- 🔒 **Data Persistence** - H2/MySQL/PostgreSQL support

---

## 🖼️ Demo

<div align="center">

### Desktop Experience

```
╔══════════════════════════════════════════════════════════╗
║                      ✨ Todo ✨                          ║
║              Keep life simple & organized                ║
╠══════════════════════════════════════════════════════════╣
║                                                          ║
║  ┌────────────────────────────────────────┐             ║
║  │ What needs to be done?        │ Add Task│             ║
║  └────────────────────────────────────────┘             ║
║                                                          ║
║  ┌──────────────────────────────────────────────────┐   ║
║  │ ☐ Buy groceries for the week    [Done] [Delete] │   ║
║  └──────────────────────────────────────────────────┘   ║
║                                                          ║
║  ┌──────────────────────────────────────────────────┐   ║
║  │ ✓ Finish project presentation    [Undo] [Delete]│   ║
║  └──────────────────────────────────────────────────┘   ║
║                                                          ║
║  ┌──────────────────────────────────────────────────┐   ║
║  │ ☐ Call dentist for appointment  [Done] [Delete] │   ║
║  └──────────────────────────────────────────────────┘   ║
║                                                          ║
╚══════════════════════════════════════════════════════════╝
```

### Mobile Experience

Perfect touch-friendly layout with optimized buttons and spacing.

</div>

---

## 🚀 Quick Start

Get MindList running on your local machine in 3 simple steps:

### Prerequisites

- **Java 17+** - [Download](https://www.oracle.com/java/technologies/downloads/)
- **Maven 3.6+** - [Download](https://maven.apache.org/download.cgi)
- **Git** - [Download](https://git-scm.com/downloads)

### Installation

```bash
# 1. Clone the repository
git clone https://github.com/harshaadeshmukh/MindList.git
cd MindList

# 2. Build the project
mvn clean install

# 3. Run the application
mvn spring-boot:run
```

### Access the Application

Open your browser and navigate to:
```
http://localhost:8080
```

🎉 **That's it!** You're ready to start managing your tasks.

---

## 🛠️ Tech Stack

<div align="center">

### Backend

| Technology | Version | Purpose |
|------------|---------|---------|
| ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?logo=spring-boot&logoColor=white) | 3.x | Application Framework |
| ![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-3.x-6DB33F?logo=spring&logoColor=white) | 3.x | Database Operations |
| ![H2 Database](https://img.shields.io/badge/H2-2.x-blue?logo=h2&logoColor=white) | 2.x | In-Memory Database |
| ![Lombok](https://img.shields.io/badge/Lombok-1.18+-red?logo=lombok&logoColor=white) | 1.18+ | Code Generation |
| ![Maven](https://img.shields.io/badge/Maven-3.6+-C71A36?logo=apache-maven&logoColor=white) | 3.6+ | Build Tool |

### Frontend

| Technology | Version | Purpose |
|------------|---------|---------|
| ![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.x-005F0F?logo=thymeleaf&logoColor=white) | 3.x | Template Engine |
| ![Bootstrap](https://img.shields.io/badge/Bootstrap-5.3-7952B3?logo=bootstrap&logoColor=white) | 5.3 | CSS Framework |
| ![JavaScript](https://img.shields.io/badge/JavaScript-ES6+-F7DF1E?logo=javascript&logoColor=black) | ES6+ | Interactivity |
| ![CSS3](https://img.shields.io/badge/CSS3-Custom-1572B6?logo=css3&logoColor=white) | - | Styling & Animations |
| ![Google Fonts](https://img.shields.io/badge/Google%20Fonts-Typography-4285F4?logo=google&logoColor=white) | - | Playfair Display & DM Sans |

</div>

---

## 📁 Project Structure

```
MindList/
├── 📂 src/
│   ├── 📂 main/
│   │   ├── 📂 java/com/harshad/mindlist/
│   │   │   ├── 📂 controller/
│   │   │   │   └── 📄 TodoController.java        # Request handling
│   │   │   ├── 📂 model/
│   │   │   │   └── 📄 Task.java                  # Entity class
│   │   │   ├── 📂 repository/
│   │   │   │   └── 📄 TaskRepository.java        # Database operations
│   │   │   └── 📄 MindListApplication.java       # Main application
│   │   └── 📂 resources/
│   │       ├── 📂 templates/
│   │       │   └── 📄 index.html                 # Main UI template
│   │       ├── 📂 static/
│   │       │   ├── 📂 css/
│   │       │   ├── 📂 js/
│   │       │   └── 📂 images/
│   │       └── 📄 application.properties         # Configuration
│   └── 📂 test/
│       └── 📂 java/
├── 📄 pom.xml                                     # Maven dependencies
├── 📄 README.md                                   # This file
├── 📄 LICENSE                                     # MIT License
└── 📄 .gitignore
```

---

## 💻 Usage Guide

### Adding a Task

1. **Type** your task in the input field
2. **Click** "Add Task" or press `Enter`
3. Your task appears instantly in the list

### Editing a Task

1. **Click** on any task title (✏️ icon appears on hover)
2. **Edit** the text in the input field
3. **Press** `Enter` or click "Save" to save changes
4. **Press** `ESC` or click "Cancel" to discard

### Completing a Task

1. **Click** "Done" button or the checkbox
2. Task gets a strikethrough style
3. **Click** "Undo" to mark as incomplete

### Deleting a Task

1. **Click** "Delete" button
2. Task is permanently removed

### ⌨️ Keyboard Shortcuts

| Key | Action |
|-----|--------|
| `Enter` | Save changes when editing |
| `ESC` | Cancel editing |
| `Tab` | Navigate between elements |

---

## ⚙️ Configuration

### Database Options

#### H2 Database (Default - Development)

Perfect for development and testing. No setup required!

```properties
# application.properties
spring.datasource.url=jdbc:h2:mem:mindlist
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```

Access H2 Console: `http://localhost:8080/h2-console`

#### MySQL (Production)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mindlist
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

**Add MySQL dependency to `pom.xml`:**
```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>
```

#### PostgreSQL (Production)

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/mindlist
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

**Add PostgreSQL dependency to `pom.xml`:**
```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

### Server Configuration

**Change Port:**
```properties
server.port=9090
```

**Enable HTTPS:**
```properties
server.ssl.enabled=true
server.ssl.key-store=classpath:keystore.p12
server.ssl.key-store-password=your_password
server.ssl.key-store-type=PKCS12
```

---

## 🎨 Customization

### Color Scheme

Edit the CSS variables in `index.html` to match your brand:

```css
:root {
    --primary: #6366f1;           /* Purple - Main color */
    --primary-dark: #4f46e5;      /* Darker purple */
    --primary-light: #818cf8;     /* Lighter purple */
    --accent: #f59e0b;            /* Amber - Accent color */
    --success: #10b981;           /* Green - Success */
    --danger: #ef4444;            /* Red - Delete */
    --bg-gradient-start: #faf5ff; /* Background start */
    --bg-gradient-end: #ede9fe;   /* Background end */
}
```

### Typography

Replace Google Fonts import:

```html
<link href="https://fonts.googleapis.com/css2?family=Your+Display+Font:wght@600;700&family=Your+Body+Font:wght@400;500;600&display=swap" rel="stylesheet">
```

Update font families in CSS:

```css
.todo-title {
    font-family: 'Your Display Font', serif;
}

body {
    font-family: 'Your Body Font', sans-serif;
}
```

### Animation Speed

Adjust animation durations:

```css
/* Make animations faster */
.task-item {
    transition: all 0.2s ease; /* from 0.3s */
}

/* Make background float slower */
@keyframes float {
    animation: float 30s ease-in-out infinite; /* from 20s */
}
```

---

## 🧪 Testing

### Run Tests

```bash
mvn test
```

### Run with Coverage

```bash
mvn clean test jacoco:report
```

View coverage report at: `target/site/jacoco/index.html`

### Manual Testing Checklist

- [ ] Add a new task
- [ ] Edit task by clicking on title
- [ ] Mark task as complete
- [ ] Undo completion
- [ ] Delete a task
- [ ] Test keyboard shortcuts (Enter, ESC)
- [ ] Test on mobile device
- [ ] Test with empty task list
- [ ] Test with long task titles
- [ ] Refresh page and verify persistence

---

## 🐛 Troubleshooting

### Common Issues and Solutions

#### Port 8080 Already in Use

**Problem:** Error: `Web server failed to start. Port 8080 was already in use.`

**Solution:**

```bash
# Find process using port 8080
lsof -i :8080

# Kill the process
kill -9 <PID>

# Or change port in application.properties
server.port=9090
```

#### Maven Build Fails

**Problem:** Dependencies not downloading or build errors

**Solution:**

```bash
# Clean and rebuild
mvn clean install -U

# Skip tests if needed
mvn clean install -DskipTests
```

#### H2 Console Not Accessible

**Problem:** Cannot access H2 console at `/h2-console`

**Solution:**

Add to `application.properties`:
```properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

#### Application Starts but Blank Page

**Problem:** Application runs but shows blank page

**Solution:**

1. Check if templates are in correct directory: `src/main/resources/templates/`
2. Verify Thymeleaf dependency in `pom.xml`
3. Check browser console for JavaScript errors
4. Clear browser cache

#### Database Connection Error

**Problem:** Cannot connect to MySQL/PostgreSQL

**Solution:**

1. Verify database is running: `sudo service mysql status`
2. Check credentials in `application.properties`
3. Ensure database exists: `CREATE DATABASE mindlist;`
4. Check firewall settings

---

## 🚀 Deployment

### Deploy to Heroku

```bash
# 1. Create Heroku app
heroku create your-app-name

# 2. Add PostgreSQL addon
heroku addons:create heroku-postgresql:hobby-dev

# 3. Deploy
git push heroku main

# 4. Open app
heroku open
```

### Deploy to Railway

1. Push to GitHub
2. Go to [Railway.app](https://railway.app)
3. Click "New Project"
4. Select your repository
5. Add PostgreSQL database
6. Deploy automatically

### Deploy with Docker

**Dockerfile:**
```dockerfile
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
```

**Build and Run:**
```bash
# Build JAR
mvn clean package

# Build Docker image
docker build -t mindlist .

# Run container
docker run -p 8080:8080 mindlist
```

---

## 📚 Documentation

### Additional Resources

- 📖 [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- 🌿 [Thymeleaf Guide](https://www.thymeleaf.org/documentation.html)
- 🎨 [Bootstrap Documentation](https://getbootstrap.com/docs/)
- 🔧 [Lombok Features](https://projectlombok.org/features/)

### API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/` | Display all tasks |
| POST | `/` | Create new task |
| POST | `/{id}/update` | Update task title |
| GET | `/{id}/toggle` | Toggle task completion |
| GET | `/{id}/delete` | Delete task |

---

## 🤝 Contributing

Contributions make the open-source community amazing! Any contributions are **greatly appreciated**.

### How to Contribute

1. **Fork** the Project
2. **Create** your Feature Branch
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. **Commit** your Changes
   ```bash
   git commit -m 'Add some AmazingFeature'
   ```
4. **Push** to the Branch
   ```bash
   git push origin feature/AmazingFeature
   ```
5. **Open** a Pull Request

### Contribution Guidelines

- Write clear, descriptive commit messages
- Follow existing code style and conventions
- Add tests for new features
- Update documentation as needed
- Keep pull requests focused on a single feature/fix

### Code of Conduct

Be respectful, inclusive, and constructive in all interactions.

---

## 📋 Roadmap

- [x] Core task management (Add, Edit, Delete, Complete)
- [x] Beautiful responsive UI
- [x] Click-to-edit functionality
- [x] H2 database integration
- [ ] User authentication and registration
- [ ] Multiple todo lists/categories
- [ ] Task priorities and due dates
- [ ] Dark mode toggle
- [ ] Export tasks to CSV/JSON
- [ ] Task search and filtering
- [ ] Drag-and-drop reordering
- [ ] Task sharing and collaboration
- [ ] Mobile app (React Native)
- [ ] API for third-party integrations

**Want to work on a feature?** Open an issue to discuss it!

---

## 📄 License

Distributed under the **MIT License**. See `LICENSE` file for more information.

```
MIT License - Copyright (c) 2024 Harshad Deshmukh
```

---

## 👨‍💻 Author

<div align="center">

### Harshad Deshmukh

**Full Stack Developer | Java Enthusiast | UI/UX Designer**

[![Portfolio](https://img.shields.io/badge/Portfolio-harshaadeshmukh.netlify.app-6366f1?style=for-the-badge&logo=netlify&logoColor=white)](https://harshaadeshmukh.netlify.app)
[![GitHub](https://img.shields.io/badge/GitHub-harshaadeshmukh-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/harshaadeshmukh)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/harshad-deshmukh)
[![Email](https://img.shields.io/badge/Email-Contact-EA4335?style=for-the-badge&logo=gmail&logoColor=white)](mailto:your.email@example.com)

</div>

---

## 🙏 Acknowledgments

Special thanks to these amazing resources and communities:

- [Spring Framework Team](https://spring.io/) - Excellent framework and documentation
- [Thymeleaf Community](https://www.thymeleaf.org/) - Powerful template engine
- [Bootstrap Team](https://getbootstrap.com/) - Beautiful CSS framework
- [Google Fonts](https://fonts.google.com/) - Stunning typography
- [Shields.io](https://shields.io/) - Beautiful README badges
- [Stack Overflow](https://stackoverflow.com/) - Helpful developer community
- All contributors who help improve this project!

---

## 📊 Project Stats

<div align="center">

![GitHub last commit](https://img.shields.io/github/last-commit/harshaadeshmukh/MindList?style=for-the-badge)
![GitHub code size](https://img.shields.io/github/languages/code-size/harshaadeshmukh/MindList?style=for-the-badge)
![GitHub top language](https://img.shields.io/github/languages/top/harshaadeshmukh/MindList?style=for-the-badge)

</div>

---

<div align="center">

### ⭐ Star this repository if you find it helpful!

**Made with ❤️ by [Harshad Deshmukh](https://harshaadeshmukh.netlify.app)**

*Keep life simple & organized with MindList* ✨

[⬆ Back to Top](#-mindlist)

</div>
