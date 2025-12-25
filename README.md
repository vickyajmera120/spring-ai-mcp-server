# 🚀 Spring AI MCP Server

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.9-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Spring AI](https://img.shields.io/badge/Spring%20AI-1.1.2-blue.svg)](https://spring.io/projects/spring-ai)
[![Java](https://img.shields.io/badge/Java-25-orange.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.9.6-blue.svg)](https://maven.apache.org/)

A powerful implementation of the **Model Context Protocol (MCP)** server built with **Spring AI**. This server enables AI models to interact with Spring I/O conference session data seamlessly through standardized interfaces.

---

## ✨ Features

- 🛠️ **Dual Transport Support**: Flexible communication via both **SSE (Server-Sent Events)** and **STDIO**.
- 🔍 **Session Discovery**: Built-in tool to retrieve detailed information about Spring I/O conference sessions.
- 🍃 **Native Spring Integration**: Leveraging `spring-ai-starter-mcp-server-webmvc` for robust performance.
- 📋 **Easy Configuration**: Simple JSON-based configuration for MCP clients (like Claude Desktop).

---

## 🛠️ Tech Stack

- **Framework**: Spring Boot 3.5.9
- **AI Integration**: Spring AI 1.1.2
- **Language**: Java 25
- **Build Tool**: Maven
- **Protocols**: Model Context Protocol (MCP)

---

## 🚀 Getting Started

### Prerequisites

- **Java 25** or higher
- **Maven** (optional, wrapper included)

### Build the Project

```bash
./mvnw clean package
```

---

## 📡 Supported Transports

### 1. SSE (Server-Sent Events)
Best for web-based or remote client connections.

1. **Run the application** with the `sse` profile:
   ```bash
   ./mvnw spring-boot:run -Dspring-boot.run.profiles=sse
   ```
2. **Endpoint**: `http://localhost:8085/sse`
3. **Claude Desktop Config**:
   ```json
   {
     "mcpServers": {
       "spring-ai-mcp-server": {
         "url": "http://localhost:8085/sse"
       }
     }
   }
   ```

### 2. STDIO (Standard Input/Output)
Ideal for local execution and CLI-based MCP clients.

1. **Claude Desktop Config**:
   ```json
   {
     "mcpServers": {
       "spring-ai-mcp-server": {
         "command": "java",
         "args": [
           "-jar",
           "C:/path/to/your/project/target/spring-ai-mcp-server-0.0.1-SNAPSHOT.jar",
           "--spring.profiles.active=stdio"
         ]
       }
     }
   }
   ```

---

## 🧰 Tools Provided

### `Spring-io-sessions`
- **Description**: Retrieve a comprehensive list of sessions from the Spring I/O conference.
- **Data Source**: Powered by a curated `sessions.json` dataset.

---

## 🤝 Contributing

Contributions are welcome! Feel free to open issues or submit pull requests to improve the project.

---

---

## 👨‍💻 About the Author

I am a Backend Developer passionate about the intersection of Enterprise Java and Artificial Intelligence. This project serves as a portfolio of my ability to integrate complex AI workflows into robust Spring Boot environments.

**Connect with me:**
- [LinkedIn](https://www.linkedin.com/in/vickyajmera120/)
- [GitHub](https://github.com/vickyajmera120)

---

<p align="center">Made with ❤️ for the Spring Community</p>

