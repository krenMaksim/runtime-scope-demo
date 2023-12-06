package com.example.dao.impl;

import com.example.dao.ExampleDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class ExampleDaoImpl implements ExampleDao {

  @Override
  public List<String> getAll() { // TODO probably adding model will be useful as well
    return List.of("entity_1", "entity_2", "entity_3");
  }
}
