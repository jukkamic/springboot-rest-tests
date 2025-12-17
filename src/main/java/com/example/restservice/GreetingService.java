package com.example.restservice;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
@Slf4j
public class GreetingService {

    public String greet(String name) {
        log.info("Greeting user: {}", name);
        log.debug("Logger class: {}", log.getClass().getName());

        return "Hello, " + name + "!";
    }
}