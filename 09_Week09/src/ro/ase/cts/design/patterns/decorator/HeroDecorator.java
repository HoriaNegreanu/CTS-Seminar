package ro.ase.cts.design.patterns.decorator;

public abstract class HeroDecorator extends AbstractHero{

	protected AbstractHero hero;
	
	//we do not need the constructor from the AbstractHero class for HeroDecorator
	public HeroDecorator(AbstractHero hero) {
		super(hero.name, hero.points);
		this.hero = hero;
	}

	//not necessary to override methods, but should be overridden here
	@Override
	public void move(int distance) {
		this.hero.move(distance);
	}

	@Override
	public int getPoints() {
		return this.hero.getPoints();
	}
	
	public AbstractHero removeDecorator() {
		return this.hero;
	}
}
