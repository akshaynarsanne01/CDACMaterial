package com.taskmanager;

import java.time.LocalDate;
import java.util.Objects;

public class Task implements Comparable<Task> {
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private boolean active;
	private status status;
	private static int count = 0;

	public Task() {
		super();
		count++;
		this.taskId = count++;
		this.taskName = "";
		this.description = "";
		this.taskDate = LocalDate.now();
		this.active = true;
		this.status = status.PENDING;
	}

	public Task(String taskName, String description, LocalDate taskDate) {
		super();
		count++;
		this.taskId = count;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.active = true;
		this.status = status.PENDING;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public status getStatus() {
		return status;
	}

	public void setStatus(status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", active=" + active + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(taskId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(taskId, other.taskId) && Objects.equals(taskName, other.taskName)
				&& Objects.equals(description, other.description) && Objects.equals(taskDate, other.taskDate)
				&& status == other.status;
	}

	@Override
	public int compareTo(Task other) {
		return this.taskDate.compareTo(other.taskDate);
	}

}
