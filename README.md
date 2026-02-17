# ArithmeticWebApp

A simple Java EE web application that performs basic arithmetic operations (addition, subtraction, multiplication, division) following the MVC pattern. Built with Servlets, JSP, HTML, and deployed on GlassFish 4.1.1.

---

## 📸 Screenshots

| Screenshot | Description |
|------------|-------------|
| ![Project Structure](screenshots/pro_structure.png) | Project structure in NetBeans |
| ![Home Page](screenshots/home.png) | Home page (`index.html`) |
| ![Menu Page](screenshots/menuPage.png) | Menu page with operation links |
| ![Addition Form](screenshots/add.png) | Addition form (`add.html`) |
| ![Outcome Page](screenshots/outcome.png) | Sample outcome page (`add_outcome.jsp`) |

> **Note:** Place your screenshots in a `screenshots/` folder at the root of your repository.

---

## 🛠️ Technologies

- Java 8, Java EE (Servlets, JSP)
- HTML5
- GlassFish 4.1.1
- NetBeans IDE

*IDE‑specific files (`nbproject/`, `build/`) are **not** included in this repository.*

---

## 🚀 Quick Start

1. **Clone** the repo.
2. **Open in NetBeans** (or any IDE) as a web project.
3. **Add GlassFish 4.1.1** as the server.
4. **Clean, build, and run** – the app will open at `http://localhost:8080/ArithmeticWebApp/`.

Alternatively, deploy the WAR manually via GlassFish Admin Console.

---

## ✨ Features

- Four arithmetic operations with separate servlet controllers.
- Shared model (`ArithmeticManager`) for business logic.
- JSP views for results.
- Clean MVC separation.

---

## 📝 License

Free for educational use.
