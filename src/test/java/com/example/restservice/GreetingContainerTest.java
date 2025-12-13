package com.example.restservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.client.RestTestClient;

@SpringBootTest
@AutoConfigureRestTestClient
public class GreetingContainerTest {

  @Autowired
  private RestTestClient restTestClient;

  @MockitoBean
  private GreetingService service;

  @Test
  void greetingShouldReturnDefaultMessage() {
    when(service.greet(any())).thenReturn("Hello, World!");
    Greeting greeting = restTestClient.get()
        .uri("/greeting")
        .exchange()
        .expectBody(Greeting.class)
        .returnResult().getResponseBody();
    assertNotNull(greeting);
    assertEquals("Hello, World!", greeting.content());
  }
}
