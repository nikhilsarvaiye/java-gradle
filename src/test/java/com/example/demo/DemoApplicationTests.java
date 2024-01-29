package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.repository.TestRepository;
import com.example.demo.service.TestService;

@SpringBootTest
class DemoApplicationTests {

	// Arrane
	@MockBean
	TestRepository testRepository;

	@Autowired
	TestService testService;

	@BeforeEach
	// add whatever you want to run before each unit test like a initial setup
	void initUseCase() {
		// Act
		// when(testRepository.addition(any(int.class), any(int.class))).thenReturn(30);
	}

	@Test
	void addition() {
		// Act
		when(testRepository.addition(any(int.class), any(int.class))).thenReturn(30);

		// Act
		int result = testService.addition(10, 20);

		// Assert
		assertEquals(90, result);
	}
}
