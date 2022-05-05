package ro.ase.csie.cts.Horia.Negreanu.g1099.adapter;

import ro.ase.csie.cts.Horia.Negreanu.g1099.adapter.ExternalTask.ExternalTask;
import ro.ase.csie.cts.Horia.Negreanu.g1099.adapter.ExternalTask.ExternalTaskInterface;
import ro.ase.csie.cts.Horia.Negreanu.g1099.adapter.ExternalTask.ExternalTaskToTaskAdapter;

public class Adapter {

	public static void main(String[] args) {
		TaskInterface task = new Task("Task 1", "description 1", 0);
		task.addWorkedHours(2);
		if(task instanceof Task) {
			Task t = (Task)task;
			System.out.println(t.getWorkedHours()); 
		}
		System.out.println(task.getDescription());
		
		ExternalTaskInterface externalTask = new ExternalTask("External task 1", "Description 2", 0, false);
		TaskInterface task2 = new ExternalTaskToTaskAdapter(externalTask);
		task2.addWorkedHours(5);
		System.out.println(task2.getDescription());
	}

}
