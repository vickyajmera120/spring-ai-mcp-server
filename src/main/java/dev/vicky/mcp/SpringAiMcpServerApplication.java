package dev.vicky.mcp;

import java.util.List;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.vicky.mcp.component.SessionTools;

@SpringBootApplication
public class SpringAiMcpServerApplication {

	static void main(String[] args) {
		SpringApplication.run(SpringAiMcpServerApplication.class, args);
	}


	@Bean
	public List<ToolCallback> springIoSessionTools(SessionTools sessionTools) {

		return List.of(ToolCallbacks.from(sessionTools));
	}
}
