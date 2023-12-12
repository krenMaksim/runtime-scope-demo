package com.example.dao.impl;

import com.example.dao.ExampleDao;
import com.example.dao.entity.ExampleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class ExampleDaoImpl implements ExampleDao {

  @Override
  public List<ExampleEntity> getAll() {
    return List.of(new ExampleEntity("1", "data_1"), new ExampleEntity("2", "data_2"));
  }
}
