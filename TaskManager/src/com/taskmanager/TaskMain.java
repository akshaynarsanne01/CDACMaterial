package com.taskmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.TaskUtils.TaskUtils.*;

public class TaskMain {

	public static void main(String[] args) {
		List<Task> mylist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Menu");
			System.out.println("1] Add new Task");
			System.out.println("2] Delete Task");
			System.out.println("3] Update Task");
			System.out.println("4] Display all pending tasks");
			System.out.println("5] Display all pending tasks for today");
			System.out.println("6] Display all the tasks sorted by taskDate");
			System.out.println("7] Display all the tasks");
			System.out.println("8] Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addTask(mylist, sc);
				break;
			case 2:
				deleteTask(mylist, sc);
				break;
			case 3:
				updateTask(mylist, sc);
				break;
			case 4:
				allPendingTasks(mylist, sc);
				break;
			case 5:
				allPendingForToday(mylist, sc);
				break;
			case 6:
				sortByDate(mylist, sc);
				break;
			case 7:
				displayTasks(mylist, sc);
				break;
			default:
				System.out.println("Enter a valid menu option");
				break;
			}

		} while (choice != 8);
	}
}
