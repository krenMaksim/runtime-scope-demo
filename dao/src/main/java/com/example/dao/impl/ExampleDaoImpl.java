package com.example.dao.impl;

import com.example.dao.api.ExampleDao;
import com.example.dao.api.model.Example;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class ExampleDaoImpl implements ExampleDao {

  @Override
  public List<Example> getAll() {
    return List.of(new Example("1", "data_1"), new Example("2", "data_2"));
  }
}
