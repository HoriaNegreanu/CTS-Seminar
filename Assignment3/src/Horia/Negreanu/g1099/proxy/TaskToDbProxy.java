package Horia.Negreanu.g1099.proxy;

public class TaskToDbProxy implements TaskToDBInterface{
	
	private Task task;

	public TaskToDbProxy(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void addToDB() {
		if(this.task.description == null) {
			System.out.println("Task description cannot be empty");
		}
		else if(this.task.description.length() == 0 || this.task.description == null) {
			System.out.println("Task description cannot be empty");
		}
		else {
			System.out.println("Task added to DB");
		}
	}

}
