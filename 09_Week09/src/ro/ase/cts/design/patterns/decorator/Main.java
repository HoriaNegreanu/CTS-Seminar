package ro.ase.cts.design.patterns.decorator;

public class Main {

	public static void main(String[] args) {
		AbstractHero darkKnight = new Knight("Dark Knight", 100);
		darkKnight.move(100);
		darkKnight.defend(10);
		
		AbstractHero whiteKnight = new Knight("White Knight", 100);
		
		//adds shield to darkKnight
		System.out.println("-----------------------");
		darkKnight = new ShieldDecorator(darkKnight, 50);
		darkKnight.move(100);
		darkKnight.defend(60);
		
		System.out.println("-----------------------");
		darkKnight = new WoundedDecorator(darkKnight);
		darkKnight.defend(120);
		darkKnight.move(100);
		
		darkKnight = ((HeroDecorator)darkKnight).removeDecorator();
		darkKnight.move(100);
	}
}
