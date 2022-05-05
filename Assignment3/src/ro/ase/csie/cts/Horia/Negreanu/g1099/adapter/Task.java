package ro.ase.csie.cts.Horia.Negreanu.g1099.adapter;

public class Task implements TaskInterface{
	String title;
	String description;
	float workedHours;

	public Task(String title, String description, float workedHours) {
		super();
		this.title = title;
		this.description = description;
		this.workedHours = workedHours;
	}

	@Override
	public void addWorkedHours(float workedHours) {
		this.workedHours += workedHours;
		System.out.println("Added " + workedHours + " to " + this.title);
	}

	@Override
	public String getDescription() {
		return this.description;
	}
	
	public float getWorkedHours() {
		return this.workedHours;
	}
}
