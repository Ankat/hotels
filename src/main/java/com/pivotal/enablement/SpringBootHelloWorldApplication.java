package com.pivotal.enablement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	Logger logger = LoggerFactory
			.getLogger(SpringBootHelloWorldApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

	/**
	 * 
	 * Loads the database on startup
	 * 
	 * @param hr
	 * @return
	 */
	@Bean
	CommandLineRunner loadDatabase(HotelRepository hr) {
		return args -> {
			logger.debug("loading database..");
			hr.save(new Hotel(1, "Marriott"));
			hr.save(new Hotel(2, "Hilton"));
			hr.save(new Hotel(3, "Hyatt"));
			hr.save(new Hotel(4, "Crowne Plaza"));
			hr.save(new Hotel(5, "Sheraton"));
			logger.debug("record count: {}", hr.count());
			hr.findAll().forEach(x -> logger.debug(x.toString()));
		};

	}

}
