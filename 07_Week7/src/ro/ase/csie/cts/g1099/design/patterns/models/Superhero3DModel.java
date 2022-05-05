package ro.ase.csie.cts.g1099.design.patterns.models;

import java.util.ArrayList;
import java.util.Random;

import ro.ase.csie.cts.g1099.design.patterns.interfaces.WeaponInterface;

public class Superhero3DModel implements Cloneable{
	String name;
	boolean isPositive;
	boolean isCriticalWounded;
	int lifepoints;
	
	WeaponInterface leftHandWeapon;
	WeaponInterface rightHandWeapon;
	
	SuperPower superPower;
	SuperPower ultimatePower;
	
	String modelFileName;
	ArrayList<Point3D> points;
	
	private Superhero3DModel() {
		
	}
	
	private Superhero3DModel(String name, String modelFileName) {
		//we read the file and create the points list
		System.out.println("Loading the model file");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Random random = new Random();
		int noPoints = random.nextInt(1000);
		
		this.points = new ArrayList<>(noPoints);
		for(int i=0;i<noPoints;i++) {
			points.add(new Point3D(random.nextInt(Point3D.LIMIT), random.nextInt(Point3D.LIMIT), random.nextInt(Point3D.LIMIT)));
		}
	}
	
	@Override
	public Object clone(){
		
		//is a mistake
		//Superhero3DModel copy = new Superhero3DModel(this.name,this.modelFileName);
		
		Superhero3DModel copy = new Superhero3DModel();
		copy.name = this.name;
		copy.isPositive = this.isPositive;
		copy.isCriticalWounded = this.isCriticalWounded;
		copy.lifepoints = this.lifepoints;
		copy.points = (ArrayList<Point3D>) this.points.clone();
		copy.leftHandWeapon = this.leftHandWeapon.clone();
		copy.rightHandWeapon = this.rightHandWeapon.clone();
		
		return copy;
	}
	
	
	
	private void setName(String name) {
		this.name = name;
	}

	private void setPositive() {
		this.isPositive = true;
	}
	
	private void setNegative() {
		this.isPositive = false;
	}

	private void setCriticalWounded() {
		this.isCriticalWounded = true;
	}

	private void setLifepoints(int lifepoints) {
		this.lifepoints = lifepoints;
	}

	private void setLeftHandWeapon(WeaponInterface leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon.clone();
	}

	private void setRightHandWeapon(WeaponInterface rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon.clone();
	}

	private void setSuperPower(SuperPower superPower) {
		this.superPower = superPower;
	}

	private void setUltimatePower(SuperPower ultimatePower) {
		this.ultimatePower = ultimatePower;
	}

	public static class SuperheroBuilder {
		private Superhero3DModel superhero;
		
		public SuperheroBuilder(String name, String fileName) {
			this.superhero = new Superhero3DModel(name, fileName);
		}
		
		public SuperheroBuilder setPositive() {
			this.superhero.setPositive();
			return this;
		}
		
		public SuperheroBuilder setCriticalWounder() {
			this.superhero.setCriticalWounded();
			return this;
		}
		
		//other methods for other attributes
		
		public Superhero3DModel build() {
			return this.superhero;
		}
	}
}
