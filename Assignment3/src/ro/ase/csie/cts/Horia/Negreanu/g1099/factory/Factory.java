package ro.ase.csie.cts.Horia.Negreanu.g1099.factory;

public class Factory {

	public static void main(String[] args) {
		
		AbstractEmployee programmer = EmployeeFactory.getEmployee(EmployeeType.PROGRAMMER, "Steven", 4000);
		AbstractEmployee qa = EmployeeFactory.getEmployee(EmployeeType.QA, "Mike", 2500);
		AbstractEmployee projectManager = EmployeeFactory.getEmployee(EmployeeType.PROJECT_MANAGER, "John", 6000);
		
		programmer.displayType();
		qa.displayType();
		projectManager.displayType();
	}

}
