package com.javatest.online.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javatest.online.todolist.model.Task;
import com.javatest.online.todolist.service.TaskService;

@Controller
public class TaskController {

	private TaskService taskService;

	@Autowired
	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}

	@RequestMapping("/")
	String index(Model model) {
		return "index";
	}

	@RequestMapping(value = "/tasks", method = RequestMethod.GET)
	public String allTasks(Model model) {
		model.addAttribute("tasks", taskService.getAllTasks());
		return "tasks";
	}

	@RequestMapping("task/{id}")
	public String showProduct(@PathVariable Integer id, Model model) {
		model.addAttribute("task", taskService.getTask(id));
		return "taskshow";
	}

	@RequestMapping(value = "task/new")
	public String taskAdd(Model model) {
		model.addAttribute("task", new Task());
		return "taskform";
	}

	@RequestMapping(value = "task", method = RequestMethod.POST)
	public String saveTask(Task task) {
		taskService.saveTask(task);
		return "redirect:/task/" + task.getId();
	}

	@RequestMapping("task/delete/{id}")
	public String delete(@PathVariable Integer id) {
		taskService.deleteTask(id);
		return "redirect:/tasks";
	}

	@RequestMapping("task/edit/{id}")
	public String update(@PathVariable Integer id, Model model) {
		model.addAttribute("task", taskService.getTask(id));
		return "taskform";
	}
}
