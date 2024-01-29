package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {
    public int addition(int a, int b) {
		return a + b;
	}
}
