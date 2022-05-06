package ro.ase.csie.cts.Horia.Negreanu.g1099.proxy;

public class Task implements TaskToDBInterface{
	String name;
	String description;
	
	
	public Task(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	@Override
	public void addToDB() {
		System.out.println("Task added to DB");
	}
	
}
