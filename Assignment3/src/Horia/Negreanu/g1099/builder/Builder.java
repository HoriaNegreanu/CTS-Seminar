package Horia.Negreanu.g1099.builder;


public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task = new Task.TaskBuilder("Title 1", "Admin", "Task description", Status.Proposed).build();
		System.out.println(task.toString());
		
		Task task2 = new Task.TaskBuilder("Title 2", "QA", "Task description 2", Status.Active)
				.setAssignedTo("Employee")
				.setWorkedHours(4.5f)
				.build();
		System.out.println(task2.toString());
	}

}
