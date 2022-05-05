package ro.ase.csie.cts.Horia.Negreanu.g1099.prototype;

public class Prototype {

	public static void main(String[] args) {
		Message message1 = new Message("Employee 1","../text/message.txt");
		//Message message2 = new Message("Employee 2","../text/message.txt");
		Message message2 =  (Message)message1.clone();
		message2.setDestination("Employee 2");
		System.out.println(message1.toString());
		System.out.println(message2.toString());
	}

}
