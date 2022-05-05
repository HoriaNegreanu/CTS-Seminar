package ro.ase.csie.cts.Horia.Negreanu.g1099.facade;

import java.util.ArrayList;

public class Facade {

	public static void main(String[] args) {
		Task task = new Task();
		File file1 = new File();
		File file2 = new File();
		ArrayList<File> files = new ArrayList<File>();
		
		files.add(file1);
		files.add(file2);
		
		TaskDataAPIFacade taskData = new TaskDataAPIFacade(task, files);
		taskData.deleteTaskAndData();
	}

}
