package ro.ase.csie.cts.Horia.Negreanu.g1099.factory;

public abstract class AbstractEmployee {
	String name;
	float salary;
	
	public AbstractEmployee(String name, float salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public abstract void sendMessage(String message);
	public abstract void displayType();
}
