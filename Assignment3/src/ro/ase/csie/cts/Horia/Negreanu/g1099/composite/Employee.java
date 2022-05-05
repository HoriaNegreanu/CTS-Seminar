package ro.ase.csie.cts.Horia.Negreanu.g1099.composite;

public class Employee extends HierarchyNode{

	String name;
	String role;
	int tasks;
	
	
	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}

	@Override
	public String getEmployeeName() {
		return this.name;
	}

	@Override
	public String getEmployeeRole() {
		return this.role;
	}

	@Override
	public int getTasks() {
		return this.tasks;
	}

	@Override
	public String getInfo() {
		return this.name;
	}
	
}
