package Horia.Negreanu.g1099.decorator;

public class Task extends AbstractTask{

	public Task(String name, String description) {
		super(name, description);
	}

	@Override
	public void delete() {
		System.out.println("Task deleted");
	}
	
}
