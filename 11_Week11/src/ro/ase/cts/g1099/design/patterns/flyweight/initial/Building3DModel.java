package ro.ase.cts.g1099.design.patterns.flyweight.initial;

public class Building3DModel {
	String fileName;
	int[] points;
	
	DisplaySettings displaySettings;

	public Building3DModel(String fileName, DisplaySettings displaySettings) {
		super();
		this.fileName = fileName;
		this.displaySettings = displaySettings;
		
		System.out.println("Loading points from file " + this.fileName);
		this.points = new int[1000000]; //1 mil. points
	}
	
	public void display() {
		System.out.println("Displaying the building");
		System.out.println(String.format("Coordinates %d, %d and color %s", 
				this.displaySettings.getX(), this.displaySettings.getY(), this.displaySettings.getColor()));
	}
}
