package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import com.example.demo.model.EmailValidater;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void emailValidationTest_1() {
		EmailValidater emailValidater = new EmailValidater();
		boolean result = emailValidater.checkEmail("test@example.com");
		assertTrue(result);
	}

	@Test
	void emailValidationTest_2() {
		EmailValidater emailValidater = new EmailValidater();
		boolean result = emailValidater.checkEmail("testATTexample.com");
		assertFalse(result);
	}

	@Test
	void emailValidationTest_3() {
		EmailValidater emailValidater = new EmailValidater();
		boolean result = emailValidater.checkEmail("test@example@com");
		assertFalse(result);
	}

		@Test
	void emailValidationTest_4() {
		EmailValidater emailValidater = new EmailValidater();
		boolean result = emailValidater.checkEmail("@example.com.");
		assertTrue(result);
	}

}
