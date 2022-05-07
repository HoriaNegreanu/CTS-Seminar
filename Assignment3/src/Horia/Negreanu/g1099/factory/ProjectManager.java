package Horia.Negreanu.g1099.factory;

public class ProjectManager extends AbstractEmployee {
	
	int projectsUnderSupervision;

	public ProjectManager(String name, float salary, int projectsUnderSupervision) {
		super(name, salary);
		this.projectsUnderSupervision = projectsUnderSupervision;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

	@Override
	public void displayType() {
		System.out.println("This is a project manager");
	}
	
}
