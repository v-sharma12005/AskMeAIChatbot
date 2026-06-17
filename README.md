# AskMeAnything AI 🤖

A modern AI-powered chatbot built using **Spring Boot**, **Spring AI**, **Google Gemini 2.5 Flash**, and a custom **HTML/CSS/JavaScript frontend**. The application enables users to interact with Google's Gemini model through a clean and responsive chat interface.

---

## 🚀 Features

* AI-powered conversational chatbot
* Google Gemini 2.5 Flash integration
* Spring AI ChatClient implementation
* RESTful API architecture
* Modern chat-based frontend UI
* Real-time question and answer flow
* Environment variable based API key management
* CORS enabled for frontend integration

---

## 🛠️ Tech Stack

### Backend

* Java 21
* Spring Boot 4
* Spring AI 2.0
* Google Gemini 2.5 Flash
* Maven

### Frontend

* HTML5
* CSS3
* JavaScript (ES6)

---

## 📂 Project Structure

```text
AskMeAnythingAI/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/cfs/AksMeAnyThingAi/
│   │   │       ├── config/
│   │   │       │   └── ChatClientConfig.java
│   │   │       ├── controller/
│   │   │       │   └── ChatController.java
│   │   │       └── AksMeAnyThingAiApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│
├── AskMeAiUI/
│   ├── index.html
│   ├── style.css
│   └── script.js
│
├── pom.xml
└── README.md
```

---

## ⚙️ Configuration

Set your Gemini API key as an environment variable.

### Windows

```cmd
set GEMINI_API_KEY=YOUR_API_KEY
```

### Linux/macOS

```bash
export GEMINI_API_KEY=YOUR_API_KEY
```

### application.properties

```properties
spring.ai.google.genai.api-key=${GEMINI_API_KEY}
spring.ai.model.chat=google-genai
spring.ai.google.genai.chat.options.model=gemini-2.5-flash
```

---

## ▶️ Running the Backend

Clone the repository:

```bash
git clone https://github.com/v-sharma12005/AskMeAIChatbot.git
cd AskMeAIChatbot
```

Run the Spring Boot application:

```bash
mvn spring-boot:run
```

Backend will start on:

```text
http://localhost:8080
```

---

## 🌐 Running the Frontend

Open the frontend folder:

```text
AskMeAiUI/
```

Run using Live Server in VS Code or open:

```text
index.html
```

Frontend will communicate with:

```text
http://localhost:8080/api/chat
```

---

## 📡 API Endpoint

### POST

```http
http://localhost:8080/api/chat
```

### Request

```json
{
  "question": "What is AWS Lambda?"
}
```

### Response

```json
{
  "answer": "AWS Lambda is a serverless compute service provided by AWS..."
}
```

---

## 🎯 Key Learnings

* Spring AI ChatClient
* Google Gemini API Integration
* REST API Development
* Environment Variable Management
* Frontend-Backend Communication
* JSON Request/Response Handling
* Maven Dependency Management

---

## 🔮 Future Enhancements

* User Authentication
* Chat History Persistence
* Streaming Responses
* Dark/Light Theme Toggle
* Multi-Model Support (Gemini, OpenAI, Ollama)
* Docker Containerization
* Kubernetes Deployment

---

## 👨‍💻 Author

**Vishnu Sharma**

B.Tech Computer Science Engineering

Cloud | DevOps | AI Integration Enthusiast

GitHub: https://github.com/v-sharma12005

---

## ⭐ Support

If you found this project useful, consider giving it a star on GitHub.
