package Horia.Negreanu.g1099.decorator;

public abstract class AbstractTask {

	String name;
	String description;
	
	public AbstractTask(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public abstract void delete();
}
