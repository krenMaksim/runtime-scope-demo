package com.example.service.impl;

import com.example.dao.ExampleDao;
import com.example.dao.model.Example;
import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ExampleServiceImpl implements ExampleService {

  @Autowired
  private ExampleDao exampleDao;

  @Override
  public List<Example> getAllEntities() {
    return exampleDao.getAll();
  }
}
