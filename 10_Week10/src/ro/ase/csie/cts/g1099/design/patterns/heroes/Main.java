package ro.ase.csie.cts.g1099.design.patterns.heroes;

import ro.ase.csie.cts.g1099.design.patterns.heroes.disney.DisneyHeroInterface;
import ro.ase.csie.cts.g1099.design.patterns.heroes.disney.DisneySuperHero;
import ro.ase.csie.cts.g1099.design.patterns.heroes.disney.DisneyToACMEAdapter;


//Adapt Disney Heroes to ACME Heroes
public class Main {

	public static void main(String[] args) {
		
		ACMEHeroInterface superman = new ACMESuperHero("Superman", 100);
		superman.run();
		ACMEHeroInterface batman = new ACMESuperHero("Batman", 200);
		batman.defend(20);
		
		DisneyHeroInterface vader = new DisneySuperHero("Vader", 1000, false);
		ACMEHeroInterface acmeVader = new DisneyToACMEAdapter(vader);
		acmeVader.run();
		acmeVader.defend(40);
		
		ACMEHeroInterface acmeLuke = 
				new DisneyToACMEAdapter(new DisneySuperHero("Luke", 500, true));
		acmeLuke.run();
	}

}
