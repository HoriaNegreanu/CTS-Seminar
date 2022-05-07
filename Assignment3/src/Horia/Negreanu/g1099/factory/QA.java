package Horia.Negreanu.g1099.factory;

public class QA extends AbstractEmployee{

	boolean reviewingTasks;
	
	public QA(String name, float salary, boolean reviewingTasks) {
		super(name, salary);
		this.reviewingTasks = reviewingTasks;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

	@Override
	public void displayType() {
		System.out.println("This is a QA employee");
	}
	
	
}
