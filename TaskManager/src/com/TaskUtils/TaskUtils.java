package com.TaskUtils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

import com.taskmanager.Task;
import com.taskmanager.status;

public class TaskUtils {
	public static void addTask(List<Task> mylist, Scanner sc) {
		System.out.println("Enter Name of Task");
		String taskName = sc.next();
		System.out.println("Enter the description");
		String taskDescription = sc.next();
		System.out.println("Enter task Date");
		String taskDate = sc.next();
		Task newtask = new Task(taskName, taskDescription, LocalDate.parse(taskDate));
		System.out.println("task created");
		boolean validatetask = validateTask(mylist, newtask);
		if (validatetask) {
			System.out.println("Task Already Exists ");
			System.out.println("Please update the task");
		} else {
			mylist.add(newtask);
		}
	}

	public static void deleteTask(List<Task> mylist, Scanner sc) {
		System.out.println("Enter the task id");
		int taskid = sc.nextInt();
		Iterator<Task> iterator = mylist.iterator();
		while (iterator.hasNext()) {
			Task p = iterator.next();
			if (p.getTaskId() == taskid) {
				iterator.remove();
				System.out.println(taskid + " : Task deleted");
			}
		}
	}

	public static void updateTask(List<Task> mylist, Scanner sc) {
		System.out.println("Enter the task id");
		int taskid = sc.nextInt();
		for (Task mytask : mylist) {
			if (taskid == mytask.getTaskId()) {
				System.out.println("Enter the status you want to update as ");
				String StatusValue = sc.next();
				status valueofstatus = status.valueOf(StatusValue.toUpperCase());
				mytask.setStatus(valueofstatus);
				System.out.println("Status updated for id : " + taskid);
			}
		}
	}

	public static void allPendingForToday(List<Task> mylist, Scanner sc) {
		System.out.println("Pending Tasks for Today:");
		for (Task myCurrentTask : mylist) {
			if (myCurrentTask.getStatus().equals(status.valueOf("PENDING"))
					&& myCurrentTask.getTaskDate().equals(LocalDate.now())) {
				System.out.println(myCurrentTask.toString());
			}
		}
	}

	public static void allPendingTasks(List<Task> mylist, Scanner sc) {
		System.out.println("Pending Tasks:");
		for (Task myCurrentTask : mylist) {
			if (myCurrentTask.getStatus().equals(status.valueOf("PENDING"))) {
				System.out.println(myCurrentTask.toString());
			}
		}
	}

	public static void sortByDate(List<Task> mylist, Scanner sc) {
		Collections.sort(mylist);
	}

	public static void displayTasks(List<Task> mylist, Scanner sc) {
		for (Task t : mylist) {
			System.out.println(t);
		}
	}

	private static boolean validateTask(List<Task> mylist, Task mytask) {
		for (Task myCurrentTask : mylist) {
			if (myCurrentTask.getTaskName().equals(mytask.getTaskName())
					&& myCurrentTask.getDescription().equals(mytask.getDescription())
					&& myCurrentTask.getTaskDate().equals(mytask.getTaskDate())) {
				System.out.println("Task with the same name, description, and date already exists.");
				System.out.println("Please update the task.");
				return true;
			}
		}
		return false;
	}

}
