package ro.ase.cts.g1099.design.patterns.flyweight;

public class BuildingModelFlyweight implements BuildingModelInterface{

	String fileName;
	int[] points;
	
	public BuildingModelFlyweight(String fileName) {
		super();
		this.fileName = fileName;
		System.out.println("Loading the model from " + this.fileName);
		this.points = new int[1000000];
	}

	@Override
	public void display(DisplaySettings displaySettings) {
		System.out.println("Displaying the building");
		System.out.println(String.format("Coordinates %d, %d and color %s", 
				displaySettings.getX(), displaySettings.getY(), displaySettings.getColor()));
	}

}
