package ro.ase.cts.g1099.design.patterns.observer;

public class Main {

	public static void main(String[] args) {
		ConnectionModule connectionModule = new ConnectionModule("1.1.1.1");
		BackupModule backup = new BackupModule();
		NotificationsModule notifications= new NotificationsModule();
		connectionModule.register(backup);
		connectionModule.register(notifications);
		connectionModule.connect();
		
		System.out.println("***********************");
		connectionModule.unregister(notifications);
		connectionModule.connect();
	}

}
