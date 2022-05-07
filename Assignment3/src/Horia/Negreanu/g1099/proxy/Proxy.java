package Horia.Negreanu.g1099.proxy;

public class Proxy {

	public static void main(String[] args) {
		TaskToDBInterface task = new Task("task1","");
		
		task.addToDB();
		
		//Apply proxy
		if(task instanceof Task) {
			task = new TaskToDbProxy((Task)task);
		}
		
		task.addToDB();
	}

}
