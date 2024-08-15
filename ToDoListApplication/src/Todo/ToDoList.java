package Todo;

import java.util.ArrayList;

public class ToDoList {
	private ArrayList<Task> tasks; // List to store task
	
	// Constructor to initialize the task list
	public ToDoList() {
		tasks = new ArrayList<>(); // Instantiate the ArrayList
	}
	
	//Method to add a new task to the list
	public void addTask(String description) {
		Task newTask = new Task(description); // Create a new task object
		tasks.add(newTask); // Add the new task to the list
	}
	
	//Method to mark a task as done
	public void markTaskAsDone(int index) {
	 if (index >= 0 && index < tasks.size()) {
		 tasks.get(index).markAsDone(); // Mark the task at the given index as done
	 } else {
		 System.out.println("Invalid task number.");
	 	}
	}
	 
	 
	 // Method to display all tasks
	 public void displayTasks() {
		 if(tasks.isEmpty()) {
			 System.out.println("Your to-do list is empty");
		 } else {
			 for(int i= 0; i < tasks.size(); i++ ) {
				 System.out.println((i + 1) + ". " + tasks.get(i).toString());
			 }
		 }
	 
	}
	
	}

