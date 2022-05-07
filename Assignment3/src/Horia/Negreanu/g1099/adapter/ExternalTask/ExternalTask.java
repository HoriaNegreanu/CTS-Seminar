package Horia.Negreanu.g1099.adapter.ExternalTask;

public class ExternalTask implements ExternalTaskInterface{

	String taskTitle;
	String requirements;
	float totalWorkedHours;
	boolean isActive;
	
	public ExternalTask(String taskTitle, String requirements, float totalWorkedHours, boolean isActive) {
		super();
		this.taskTitle = taskTitle;
		this.requirements = requirements;
		this.totalWorkedHours = totalWorkedHours;
		this.isActive = isActive;
	}

	@Override
	public void setTotalWorkedHours(float totalWorkedHours) {
		this.totalWorkedHours = totalWorkedHours;
		System.out.println("Total work hours: " + this.totalWorkedHours);
	}
	
	@Override
	public float getTotalWorkedHours() {
		return totalWorkedHours;
	}

	@Override
	public String getRequirements() {
		System.out.println("Getting task requirements");
		return this.requirements;
	}

	@Override
	public void toggleIsActive() {
		this.isActive = !this.isActive;
	}
	
}
