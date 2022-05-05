package ro.ase.csie.cts.g1099.design.patterns.weapons;

public class WeaponsFactory {
	
	//all types ask for model, so ask for model in getWeapon()
	public static AbstractWeapon getWeapon(WeaponType type, String model) {
		
		boolean isUsingWater = false;
		
		switch(type) {
		case PISTOL:
			return new Pistol(model, isUsingWater);
		case MACHINE_GUN:
			return new MachineGun(model, MachineGun.DEFAULT_FIRERATE, 0);
		case BAZOOKA:
			return new Bazooka(model, 500);
		default:
			throw new UnsupportedOperationException();
		}
		
	}
}
