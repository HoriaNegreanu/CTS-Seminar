package ro.ase.csie.cts.Horia.Negreanu.g1099.factory;

public class EmployeeFactory {
	
	static final int HOURS_PER_DAY = 8;
	static final boolean REVIEWING_TASKS = false;

	public static AbstractEmployee getEmployee(EmployeeType type, String name, float salary) {
		switch(type) {
		case PROGRAMMER:
			return new Programmer(name, salary, HOURS_PER_DAY);
		case QA:
			return new QA(name, salary, REVIEWING_TASKS);
		case PROJECT_MANAGER:
			return new ProjectManager(name, salary, 0);
		default:
			throw new UnsupportedOperationException();
		}
	}
}
