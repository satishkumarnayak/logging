package com.instanceofcake.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(LoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
		
		LOGGER.trace("Trace Message!");
		LOGGER.debug("Debug Message!");
		LOGGER.info("Info Message!");
		LOGGER.warn("Warn Message!");
		LOGGER.error("Error Message!");
	//	LOGGER.fatal("Fatal Message!");
		
		
	}

}
