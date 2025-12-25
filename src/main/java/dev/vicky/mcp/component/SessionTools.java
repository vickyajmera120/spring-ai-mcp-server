package dev.vicky.mcp.component;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import dev.vicky.mcp.records.Conference;
import dev.vicky.mcp.records.Session;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SessionTools {

	private List<Session> sessions = new ArrayList<>();

	private final ObjectMapper objectMapper;

	public SessionTools(final ObjectMapper objectMapper) {

		this.objectMapper = objectMapper;
	}

	@Tool(name = "Spring-io-sessions", description = "Retrieve sessions from Spring IO conference")
	public List<Session> getSessions() {
		return sessions;
	}

	@PostConstruct
	public void init() {
		try {
			final InputStream conferenceStream = getClass().getResourceAsStream("/sessions.json");
			final Conference conference = objectMapper.readValue(conferenceStream, Conference.class);
			this.sessions = conference.sessions();
		} catch (Exception e) {
			log.error("Failed to load sessions from JSON file", e);
		}
	}

}

