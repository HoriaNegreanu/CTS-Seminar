package ro.ase.cts.g1099.design.patterns.flyweight;

import java.util.HashMap;

public class BuildingFactory {
	static private HashMap<String, BuildingModelInterface> models = new HashMap<>();
	
	public static BuildingModelInterface getBuildingModel(String fileName) {
		BuildingModelInterface buildingModel = models.get(fileName);
		if(buildingModel == null) {
			buildingModel = new BuildingModelFlyweight(fileName);
			models.put(fileName, buildingModel);
		}
		return buildingModel;
	}
	
	public void displayNoModels() {
		System.out.println(models.size());
	}
}
