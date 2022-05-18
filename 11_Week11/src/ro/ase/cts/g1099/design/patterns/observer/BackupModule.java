package ro.ase.cts.g1099.design.patterns.observer;

public class BackupModule implements ConnectionEventInterface{

	@Override
	public void connectionDown(long timeStamp) {
		System.out.println("Autosaving game data...");
	}

}
