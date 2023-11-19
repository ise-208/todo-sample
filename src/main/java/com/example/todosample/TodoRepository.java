package com.example.todosample;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

@Mapper
public interface TodoRepository {
    @Select("select * from todos")
    Collection<TodoEntity> findAll();

    @Insert("insert into todos (id,title, completed) values(#{todo.id}, #{todo.title}, #{todo.completed})")
    void insert(@Param("todo") TodoEntity todoEntity);
}
