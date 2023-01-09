package com.jdeeb.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsInitApplication {

	private static Logger log = LoggerFactory.getLogger(SpringJenkinsInitApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("Application initated ...");
	}
	
	public static void main(String[] args) {
		log.info("Application executed....");
		SpringApplication.run(SpringJenkinsInitApplication.class, args);
	}

}
