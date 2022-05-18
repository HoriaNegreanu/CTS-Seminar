package ro.ase.cts.g1099.design.patterns.observer;

import java.util.ArrayList;
import java.util.Random;

public class ConnectionModule {
	
	String serverIp;
	boolean isConnected = false;

	//collection of event clients
	ArrayList<ConnectionEventInterface> clients = new ArrayList<>();
	
	public ConnectionModule(String serverIp) {
		super();
		this.serverIp = serverIp;
	}
	
	public void connect() {
		System.out.println("Connecting to " + this.serverIp);
		isConnected = true;
		System.out.println("Connected");
		this.monitor();
	}
	
	public void monitor() {
		while(true) {
			System.out.println("Checking connection...");
			Random random = new Random();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.isConnected = random.nextBoolean();
			if(!this.isConnected) {
				System.out.println("Connection Lost");
				
				//notify clients connection is lost
				notifyClients();
				
				return;
			}
		}
	}

	public boolean isConnected() {
		return isConnected;
	}
	
	public void register(ConnectionEventInterface client) {
		this.clients.add(client);
	}
	
	public void unregister(ConnectionEventInterface client) {
		this.clients.remove(client);
	}
	
	public void notifyClients() {
		for (ConnectionEventInterface client : clients) {
			client.connectionDown(System.currentTimeMillis());
		}
	}
}
