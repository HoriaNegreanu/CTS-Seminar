package Horia.Negreanu.g1099.decorator;

import java.util.ArrayList;

public class FilesDecorator extends TaskDecorator{

	ArrayList<String> files = new ArrayList<String>();
	
	public FilesDecorator(AbstractTask task, ArrayList<String> files) {
		super(task);
		this.files = files;
	}

	@Override
	public void delete() {
		for (String file : files) {
			System.out.println("File deleted");
		}
		System.out.println("Task deleted");
	}
	
}
