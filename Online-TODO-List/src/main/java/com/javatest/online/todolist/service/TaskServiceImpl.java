package com.javatest.online.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatest.online.todolist.model.Task;
import com.javatest.online.todolist.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;

	@Autowired
    public void setTaskRepository(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
	
	@Override
	public Iterable<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	@Override
	public Task getTask(Integer id) {
		return taskRepository.findOne(id);
	}

	@Override
	public void saveTask(Task task) {
		taskRepository.save(task);
	}

	@Override
	public void deleteTask(Integer id) {
		taskRepository.delete(id);

	}

}
