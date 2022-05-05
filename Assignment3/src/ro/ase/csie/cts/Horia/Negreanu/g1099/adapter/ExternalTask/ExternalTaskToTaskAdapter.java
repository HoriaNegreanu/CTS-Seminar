package ro.ase.csie.cts.Horia.Negreanu.g1099.adapter.ExternalTask;

import ro.ase.csie.cts.Horia.Negreanu.g1099.adapter.Task;
import ro.ase.csie.cts.Horia.Negreanu.g1099.adapter.TaskInterface;

public class ExternalTaskToTaskAdapter implements TaskInterface{

	ExternalTaskInterface externalTask;
	
	public ExternalTaskToTaskAdapter(ExternalTaskInterface task) {
		super();
		this.externalTask = task;
	}
	
	@Override
	public void addWorkedHours(float workedHours) {
		float result =  this.externalTask.getTotalWorkedHours();
		this.externalTask.setTotalWorkedHours(result + workedHours);
	}

	@Override
	public String getDescription() {
		return this.externalTask.getRequirements();
	}

}
