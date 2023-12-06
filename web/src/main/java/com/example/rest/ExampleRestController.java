package com.example.rest;

import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ExampleRestController {

  @Autowired
  private ExampleService exampleService;

  @RequestMapping("/all")
  List<String> showAll() {
    return exampleService.getAllEntities();
  }
}
