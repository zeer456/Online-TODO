package com.javatest.online.todolist.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String taskName;
	private String taskDescription;
	@DateTimeFormat (pattern="yyyy-MM-dd") 
	private Date taskCreatedDate;
	@DateTimeFormat (pattern="yyyy-MM-dd") 
	private Date taskUpdateDate;
	private String taskStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public Date getTaskCreatedDate() {
		return taskCreatedDate;
	}

	public void setTaskCreatedDate(Date taskCreatedDate) {
		this.taskCreatedDate = taskCreatedDate;
	}

	public Date getTaskUpdateDate() {
		return taskUpdateDate;
	}

	public void setTaskUpdateDate(Date taskUpdateDate) {
		this.taskUpdateDate = taskUpdateDate;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

}
