package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
@RestController
@Slf4j
public class GreetingController {

	private final AtomicLong counter = new AtomicLong();

	private final GreetingService greetingService;

	public GreetingController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(defaultValue = "World") String name) {
		log.info("Received greeting request for name: {}", name);
		log.debug("Logger class: {}", log.getClass().getName());
		String greetingMessage = greetingService.greet(name);
        return new Greeting(counter.incrementAndGet(), greetingMessage);
	}
}