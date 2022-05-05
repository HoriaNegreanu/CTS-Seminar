package ro.ase.csie.cts.g1099.design.patterns.heroes.disney;

import ro.ase.csie.cts.g1099.design.patterns.heroes.ACMEHeroInterface;

public class DisneyToACMEAdapter implements ACMEHeroInterface{
	
	DisneyHeroInterface disneyHero;
	
	public DisneyToACMEAdapter(DisneyHeroInterface hero) {
		super();
		this.disneyHero = hero;
	}

	@Override
	public void run() {
		this.disneyHero.move(10);
	}

	@Override
	public void heal(int points) {
		this.disneyHero.restorePoints(points);
	}

	@Override
	public void defend(int points) {
		DisneySuperHero hero = (DisneySuperHero)this.disneyHero;
		hero.lifepoints -= points;
		System.out.println("Hero takes a hit");
	}
	
}
