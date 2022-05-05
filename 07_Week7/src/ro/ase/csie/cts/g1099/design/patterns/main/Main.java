package ro.ase.csie.cts.g1099.design.patterns.main;

import ro.ase.csie.cts.g1099.design.patterns.models.Superhero3DModel;

public class Main {

	public static void main(String[] args) {
		//Superhero3DModel superman = new Superhero3DModel("Superman", "superman.3d");
		//Superhero3DModel superman2 = new Superhero3DModel("Superman", "superman.3d");
		//Superhero3DModel superman2 = (Superhero3DModel) superman.clone();
		
		Superhero3DModel superman = new Superhero3DModel.SuperheroBuilder("Superman", "superman.3d")
				.setCriticalWounder()
				.setPositive()
				.build();
		System.out.println("The End");
	}

}
