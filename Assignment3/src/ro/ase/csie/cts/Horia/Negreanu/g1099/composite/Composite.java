package ro.ase.csie.cts.Horia.Negreanu.g1099.composite;

public class Composite {

	public static void main(String[] args) {
		
		InternalStructure projectManagementDepartment= new InternalStructure("ProjectManagers");
		InternalStructure programmers = new InternalStructure("Programmers");
		//InternalStructure test = new InternalStructure("test");
		//test.addChildNode(new Employee("Test Name","Test role"));
		
		programmers.addChildNode(new Employee("Ana", "Junior Programmer"));
		programmers.addChildNode(new Employee("David", "Senior Programmer"));
		//programmers.addChildNode(test);
		
		projectManagementDepartment.addChildNode(new Employee("Dan","Project manager"));
		projectManagementDepartment.addChildNode(programmers);
		
		System.out.println(projectManagementDepartment.getInfo());
		System.out.println(projectManagementDepartment.getTasks());
	}

}
