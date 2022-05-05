package ro.ase.csie.cts.Horia.Negreanu.g1099.facade;

import java.util.ArrayList;

public class TaskDataAPIFacade {

	Task task;
	ArrayList<File> files;
	
	public TaskDataAPIFacade(Task task, ArrayList<File> files) {
		this.task = task;
		this.files = files;
	}
	
	public void deleteTaskAndData() {
		this.task.deleteTask();
		for (File file : files) {
			file.deleteFile();
		}
	}
}
