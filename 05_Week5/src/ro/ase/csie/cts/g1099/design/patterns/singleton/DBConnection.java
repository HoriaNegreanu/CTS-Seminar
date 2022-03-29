package ro.ase.csie.cts.g1099.design.patterns.singleton;

public class DBConnection {
	//the reference to the singleton object
	private static DBConnection connection = null;
	
	private String connectionString;
	private String database;
	private String username;
	
	private DBConnection() {
		super();
	}

	private DBConnection(String connectionString, String database, String username) {
		super();
		this.connectionString = connectionString;
		this.database = database;
		this.username = username;
	}
	
	//sync so on multithread the if is not executed at the same time resulting in 2 objects
	public synchronized static DBConnection getConnection() {
		if(connection == null) {
			connection = new DBConnection();
		}
		return connection;
	}
}
