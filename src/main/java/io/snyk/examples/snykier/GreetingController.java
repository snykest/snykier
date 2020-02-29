package io.snyk.examples.snykier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @GetMapping
  public String hello() {
    return "Hello World!";
  }
}
