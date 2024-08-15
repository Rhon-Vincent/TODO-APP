package Todo;

public class Task {
	private String description; // A string to store the task description.
	private boolean isDone; // A boolean to store the task's completion status
	
	// Constructor to initialize the task
	public Task(String description) {
		this.description = description;
		this.isDone = false; // By default, the task is not done
	}
	
	// Getter for the task description
	public String getDescription() {
		return description;
	}
	
	// Method to mark the task as done
	public void markAsDone() {
		this.isDone = true;
	}
	
	// Method to check if the task is done
	public boolean isDone() {
		return isDone;
	}
	
	// Method to return task information as a string
	@Override
	public String toString() {
		return (isDone? "[X]" : "[ ]") + description;
	}
	
	
	
	
}
