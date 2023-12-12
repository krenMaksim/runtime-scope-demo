package com.example.service.impl;

import com.example.dao.ExampleDao;
import com.example.dao.entity.ExampleEntity;
import com.example.service.ExampleService;
import com.example.service.model.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
class ExampleServiceImpl implements ExampleService {

  @Autowired
  private ExampleDao exampleDao;

  @Override
  public List<Example> getAllEntities() {
    return exampleDao.getAll()
        .stream()
        .map(this::toExample)
        .collect(Collectors.toList());
  }

  private Example toExample(ExampleEntity entity){
    return new Example(entity.id(), entity.data());
  }
}
