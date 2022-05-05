package ro.ase.csie.cts.Horia.Negreanu.g1099.composite;

public abstract class HierarchyNode {
	
	//specific methods
	public abstract String getEmployeeName();
	public abstract String getEmployeeRole();
	public abstract int getTasks();
	public abstract String getInfo();
	
	public void addChildNode(HierarchyNode node) {
		throw new UnsupportedOperationException();
	}
	
	public void deleteChildNode(HierarchyNode node) {
		throw new UnsupportedOperationException();
	}
	
	public HierarchyNode getChildNode(int i){
		throw new UnsupportedOperationException();
	}
}
