package com.javatest.online.todolist.service;

import com.javatest.online.todolist.model.Task;

public interface TaskService {

	public Iterable<Task> getAllTasks();

	public Task getTask(Integer id);

	public void saveTask(Task task);

	public void deleteTask(Integer id);

}
