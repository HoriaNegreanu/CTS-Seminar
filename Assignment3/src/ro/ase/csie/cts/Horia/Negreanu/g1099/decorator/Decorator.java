package ro.ase.csie.cts.Horia.Negreanu.g1099.decorator;

import java.util.ArrayList;

public class Decorator {

	public static void main(String[] args) {
		
		ArrayList<String> files = new ArrayList<>();
		files.add("/file1");
		files.add("/file2");
		
		AbstractTask task = new Task("task1","description1");
		task.delete();
		
		System.out.println("------------------");
		task = new FilesDecorator(task, files);
		task.delete();
	}

}
