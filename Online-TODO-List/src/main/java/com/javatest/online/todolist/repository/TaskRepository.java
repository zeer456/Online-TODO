package com.javatest.online.todolist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.javatest.online.todolist.model.Task;

@Component
public interface TaskRepository extends CrudRepository<Task, Integer> {

}
