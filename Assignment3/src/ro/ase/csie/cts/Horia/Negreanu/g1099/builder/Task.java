package ro.ase.csie.cts.Horia.Negreanu.g1099.builder;

public class Task {
	String title;
	String createdBy;
	String description;
	Status status;
	String assignedTo;
	float workedHours;
	
	@Override
	public String toString() {
		return "Task [title=" + title + ", createdBy=" + createdBy + ", description=" + description + ", status="
				+ status + ", assignedTo=" + assignedTo + ", workedHours=" + workedHours + "]";
	}

	private Task() {
		
	}

	private Task(String title, String createdBy, String description, Status status) {
		super();
		this.title = title;
		this.createdBy = createdBy;
		this.description = description;
		this.status = status;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	private void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	private void setStatus(Status status) {
		this.status = status;
	}

	private void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	private void setWorkedHours(float workedHours) {
		this.workedHours = workedHours;
	}
	
	public static class TaskBuilder {
		private Task task;
		
		public TaskBuilder(String title, String createdBy, String description, Status status) {
			this.task = new Task(title, createdBy, description, status);
		}
		
		public TaskBuilder setAssignedTo(String assignedTo) {
			this.task.setAssignedTo(assignedTo);
			return this;
		}
		
		public TaskBuilder setWorkedHours(float workedHours) {
			this.task.setWorkedHours(workedHours);
			return this;
		}
		
		public Task build() {
			return this.task;
		}
	}
}
