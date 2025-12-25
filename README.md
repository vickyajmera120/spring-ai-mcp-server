# Spring MCP Server

## Supported transports
### 1. SSE (Server Sent Events)
- Run your spring boot application with profile `sse` (server sent events)
- Connect from any MCP client using URL: http://localhost:8085/sse
- Sample config:
    ```
      {
        "mcpServers": {
          "spring IO Sessions": {
            "url": "http://localhost:8085/sse"
          }
        }
      }
    ```

### 2. STDIO (Standard Input/Output)
- Execute command 'mvn clean package' to build the project and generate the jar
- Connect from any MCP client with the command 'java -jar target/spring-mcp-server-0.0.1-SNAPSHOT.jar'
- Sample config:
  ```
  {
   "mcpServers": {
     "spring IO Sessions": {
       "command": "C:\\Software\\Zulu JDK 25\\bin\\java.exe",
       "args": [
         "-jar",
         "C:/Users/Vicky-PC/IdeaProjects/spring-ai-mcp-server/target/spring-ai-mcp-server-0.0.1-SNAPSHOT.jar",
         "--spring.profiles.active=stdio"
       ]
     }
   }
  }
```

