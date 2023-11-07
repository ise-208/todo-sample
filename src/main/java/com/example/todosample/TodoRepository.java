package com.example.todosample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

@Mapper
public interface TodoRepository {
    @Select("select * from todos")
    Collection<TodoEntity> findAll();
}
