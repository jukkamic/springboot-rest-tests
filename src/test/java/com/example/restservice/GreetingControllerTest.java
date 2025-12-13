package com.example.restservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.client.RestTestClient;

@WebMvcTest(GreetingController.class)
@AutoConfigureRestTestClient
public class GreetingControllerTest {

    @Autowired
    private RestTestClient restTestClient;

    @Test
    void greetingShouldReturnDefaultMessage() {
        Greeting greeting = restTestClient.get()
                .uri("/greeting")
                .exchange()
                .expectBody(Greeting.class)
                .returnResult().getResponseBody();
        assertNotNull(greeting);
        assertEquals("Hello, World!", greeting.content());
    }

}
