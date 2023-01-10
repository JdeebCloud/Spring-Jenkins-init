package com.jdeeb.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsInitApplicationTests {

	private Logger log = LoggerFactory.getLogger(SpringJenkinsInitApplicationTests.class);
	
	@Test
	void contextLoads() {
		log.info("Test Started");
		assertEquals(true, true);
	}

}
