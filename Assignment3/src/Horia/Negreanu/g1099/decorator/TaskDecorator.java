package Horia.Negreanu.g1099.decorator;

public abstract class TaskDecorator extends AbstractTask{

	protected AbstractTask task;
	
	public TaskDecorator(AbstractTask task) {
		super(task.name, task.description);
		this.task = task;
	}

	@Override
	public void delete() {
		this.task.delete();
	}
}
