package com.example.rest;

import com.example.service.ExampleService;
import com.example.service.model.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ExampleRestController {

  @Autowired
  private ExampleService exampleService;

  @GetMapping("/all")
  List<Example> showAll() {
    return exampleService.getAllEntities();
  }
}
