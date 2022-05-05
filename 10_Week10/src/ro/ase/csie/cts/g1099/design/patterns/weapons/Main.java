package ro.ase.csie.cts.g1099.design.patterns.weapons;

public class Main {

	//Changing a weapon class and its constructor will trigger errors in WeaponsFactory, not in main
	public static void main(String[] args) {
		
		boolean isUsingWater = true;
		
		AbstractWeapon pistol = new Pistol("Water gun", isUsingWater);
		//AbstractWeapon machineGun = new MachineGun("MP32", MachineGun.DEFAULT_FIRERATE, 3);
		
		//using the factory
		AbstractWeapon machineGun = WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "MP40");
		pistol = WeaponsFactory.getWeapon(WeaponType.PISTOL, "PT10");
		
		if(machineGun instanceof MachineGun) {
			MachineGun mg = (MachineGun)machineGun;
			mg.setFireRate(50);
		}
	}

}
