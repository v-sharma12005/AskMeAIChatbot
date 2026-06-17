# AskMeAnything AI 🤖

An AI-powered chatbot built using **Spring Boot**, **Spring AI**, and **Google Gemini 2.5 Flash**. The application exposes REST APIs that allow users to interact with Google's Gemini model and receive intelligent, real-time responses.

## 🚀 Features

* AI-powered conversational chatbot
* Integration with Google Gemini 2.5 Flash
* Built using Spring AI's ChatClient API
* RESTful API architecture
* Environment variable based API key management
* Cross-Origin support for frontend integration
* Lightweight and scalable Spring Boot backend

---

## 🛠️ Tech Stack

* Java 21
* Spring Boot 4
* Spring AI 2.0
* Google Gemini 2.5 Flash
* Maven
* REST APIs

---

## 📂 Project Structure

```text
src/
├── main/
│   ├── java/
│   │   └── com/cfs/AksMeAnyThingAi/
│   │       ├── config/
│   │       │   └── ChatClientConfig.java
│   │       ├── controller/
│   │       │   └── ChatController.java
│   │       └── AksMeAnyThingAiApplication.java
│   │
│   └── resources/
│       └── application.properties
│
└── pom.xml
```

## ⚙️ Configuration

Set your Gemini API key as an environment variable:

### Windows

```cmd
set GEMINI_API_KEY=YOUR_API_KEY
```

### Linux / macOS

```bash
export GEMINI_API_KEY=YOUR_API_KEY
```

Configure `application.properties`:

```properties
spring.ai.google.genai.api-key=${GEMINI_API_KEY}
spring.ai.model.chat=google-genai
spring.ai.google.genai.chat.options.model=gemini-2.5-flash
```

---

## ▶️ Running the Application

Clone the repository:

```bash
git clone https://github.com/v-sharma12005/AskMeAnythingAI.git
cd AskMeAnythingAI
```

Run the application:

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

## 📡 API Endpoint

### Chat with AI

**POST**

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

## 🎯 Future Enhancements

* React Frontend Integration
* Chat History Persistence
* User Authentication
* Streaming AI Responses
* Multi-Model Support (Gemini, OpenAI, Ollama)

---

## 👨‍💻 Author

**Vishnu Sharma**

* B.Tech CSE
* AWS & DevOps Enthusiast
* Cloud | DevOps | AI Integration Projects

---

## 📜 License

This project is licensed under the MIT License.
