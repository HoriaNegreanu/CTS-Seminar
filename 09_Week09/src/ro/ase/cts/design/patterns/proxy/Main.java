package ro.ase.cts.design.patterns.proxy;

public class Main {

	public static void main(String[] args) {
		LoginInterface gameLoginModule = new LoginModule();
		if(gameLoginModule.checkCredentials("admin","1234")) {
			System.out.println("Hello Admin");
		}

		//the attacker
//		String[] passwords = {"123", "admin", "root", "1234"};
//		for(int i = 0; i < 4; i++) {
//			if(gameLoginModule.checkCredentials("admin",passwords[i])) {
//				System.out.println("Found the password: " + passwords[i]);
//			}
//		}
		
		//add proxy
		gameLoginModule = new LoginFilterProxy(gameLoginModule, 3);
		
		String[] passwords = {"123", "admin", "root", "1234"};
		for(int i = 0; i < 4; i++) {
			if(gameLoginModule.checkCredentials("admin",passwords[i])) {
				System.out.println("Found the password: " + passwords[i]);
			}
		}
		
	}

}
