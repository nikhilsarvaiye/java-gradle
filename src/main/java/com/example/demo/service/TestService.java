package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.TestRepository;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public String test(String value) {
        return "TestService-Test --> " + value;
    }

	public int addition(int a, int b) {
		int result = testRepository.addition(a, b);

        return result * 3;
	}
}
