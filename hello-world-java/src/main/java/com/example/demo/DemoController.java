package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping(path = "/")
  public String demo() {
    return "Hello, World! (From Java v1)";
  }
}
