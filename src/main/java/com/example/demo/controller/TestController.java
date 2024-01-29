package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

@RestController
public class TestController {

    @Autowired
    TestService testService;
    
    @GetMapping("/")
    public String Get(@RequestParam(value = "name", defaultValue = "abc") String value) {
        return testService.test(value);
    }
    
    @GetMapping("/add")
    public int Get(@RequestParam(value = "a", defaultValue = "2") int a, @RequestParam(value = "b", defaultValue = "10") int b) {
        return testService.addition(a, b);
    }
}
