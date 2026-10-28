/*
 * Problem statement:
 * Check that the Spring Boot application starts successfully and that its
 * configuration can be loaded before testing individual web endpoints.
 *
 * Hint:
 * @SpringBootTest loads the application context for an integration test.
 * Add tests with MockMvc when you want to call controller URLs without
 * manually opening a browser.
 */
package com.spring.boot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootApplicationTests {

	@Test
	void contextLoads() {
	}

}
