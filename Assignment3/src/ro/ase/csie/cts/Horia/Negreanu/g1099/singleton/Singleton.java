package ro.ase.csie.cts.Horia.Negreanu.g1099.singleton;


public class Singleton {

	public static void main(String[] args) {
		DBConnection mysql = DBConnection.getConnection("connectionString", "user", "pass");
		DBConnection mysql2 = DBConnection.getConnection("connectionString2", "user2", "pass2");
		
		if(mysql.toString().equals(mysql2.toString())) {
			System.out.println("The second object still has the same values as the first object");
		}
		
		if(mysql == mysql2) {
			System.out.println("They reference the same object");
		}
	}

}
