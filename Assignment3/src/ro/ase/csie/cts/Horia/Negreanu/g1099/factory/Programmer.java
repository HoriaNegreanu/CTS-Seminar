package ro.ase.csie.cts.Horia.Negreanu.g1099.factory;

public class Programmer extends AbstractEmployee{
	
	int hoursPerDay;
	
	public Programmer(String name, float salary, int hoursPerDay) {
		super(name, salary);
		this.hoursPerDay = hoursPerDay;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

	@Override
	public void displayType() {
		System.out.println("This is a programmer");
	}
	
}
