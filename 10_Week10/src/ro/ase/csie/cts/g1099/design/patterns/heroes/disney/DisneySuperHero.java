package ro.ase.csie.cts.g1099.design.patterns.heroes.disney;

public class DisneySuperHero implements DisneyHeroInterface{

	int lifepoints;
	String heroName;
	boolean isGoodHero;
	
	public DisneySuperHero(String heroName, int lifepoints, boolean isGoodHero) {
		super();
		this.lifepoints = lifepoints;
		this.heroName = heroName;
		this.isGoodHero = isGoodHero;
	}

	@Override
	public void move(int distance) {
		System.out.println("Hero is moving");
		
	}

	@Override
	public void restorePoints(int points) {
		System.out.println("Restoring points");
	}

	@Override
	public void addPoints(int points) {
		System.out.println("Add points");
	}
	
}
