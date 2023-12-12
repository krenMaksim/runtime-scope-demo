package com.example.service.impl;

import com.example.dao.api.ExampleDao;
import com.example.dao.api.entity.ExampleEntity;
import com.example.service.api.ExampleService;
import com.example.service.api.model.Example;
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
