package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ExampleRestController {

  @RequestMapping("/hello-world")
  String helloWorld() {
    return "Hellow world";
  }
}
