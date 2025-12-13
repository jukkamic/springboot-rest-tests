package com.example.restservice;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class GreetingService {
    private static final Logger logger = LoggerFactory.getLogger(GreetingService.class);

    public String greet(String name) {
        logger.info("Greeting user: {}", name);
        logger.debug("Logger class: {}", logger.getClass().getName());

        return "Hello, " + name + "!";
    }
}