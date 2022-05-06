package ro.ase.cts.design.patterns.decorator;

public class ShieldDecorator extends HeroDecorator{	
	
	int shieldStrength;
	
	public ShieldDecorator(AbstractHero hero, int shieldStrenght) {
		super(hero);
		this.shieldStrength = shieldStrenght;
	}

	@Override
	public void defend(int hitPoints) {
		System.out.println("The knight is using a shield");
		hitPoints -= shieldStrength;
		if(hitPoints > 0)
			this.hero.defend(hitPoints);
	}
}
