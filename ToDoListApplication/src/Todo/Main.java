package Todo;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ToDoList toDoList = new ToDoList();  // Create a new ToDoList object

	        while (true) {
	            System.out.println("\n1. Add Task");
	            System.out.println("2. Mark Task as Done");
	            System.out.println("3. View Tasks");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter task description: ");
	                    String description = scanner.nextLine();
	                    toDoList.addTask(description);  // Add task to the list
	                    break;
	                case 2:
	                    System.out.print("Enter task number to mark as done: ");
	                    int taskNumber = scanner.nextInt();
	                    toDoList.markTaskAsDone(taskNumber - 1);  // Mark the task as done
	                    break;
	                case 3:
	                    toDoList.displayTasks();  // Display all tasks
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Please choose again.");
	            }
	        }
	    }
}
