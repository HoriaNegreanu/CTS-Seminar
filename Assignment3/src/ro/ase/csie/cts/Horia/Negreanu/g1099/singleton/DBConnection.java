package ro.ase.csie.cts.Horia.Negreanu.g1099.singleton;


public class DBConnection {
	
	private static DBConnection connection = null;
	
	private String connectionString;
	private String username;
	private String password;
	
	private DBConnection() {
		super();
	}
	
	private DBConnection(String connectionString, String username, String password) {
		super();
		this.connectionString = connectionString;
		this.username = username;
		this.password = password;
	}
	
	//sync so on multithread the if is not executed at the same time resulting in 2 objects
	public synchronized static DBConnection getConnection(String connectionString, String username, String password) {
		if(connection == null) {
			connection = new DBConnection(connectionString, username, password);
		}
		return connection;
	}

	@Override
	public String toString() {
		return "DBConnection [connectionString=" + connectionString + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
}
