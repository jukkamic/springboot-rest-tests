package com.example.restservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.servlet.client.RestTestClient;

@SpringBootTest
@AutoConfigureRestTestClient
public class GreetingContainerTest {

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
