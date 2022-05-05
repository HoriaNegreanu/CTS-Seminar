package ro.ase.csie.cts.g1099.design.patterns.weapons;

public abstract class AbstractWeapon {
	//an abstract class also allows to define attributes, unlike an interface
	
	String model;
	
	public AbstractWeapon(String model) {
		super();
		this.model = model;
	}
	
	public abstract void reload();
	public abstract void shoot();
}
