package ro.ase.csie.cts.Horia.Negreanu.g1099.composite;

import java.util.ArrayList;

public class InternalStructure extends HierarchyNode{

	ArrayList<HierarchyNode> nodes = new ArrayList();
	String structureName;
	
	public InternalStructure(String structureName) {
		this.structureName = structureName;
	}
	
	@Override
	public String getEmployeeName() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getEmployeeRole() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getTasks() {
		int result = 0;
		for(HierarchyNode node : nodes) {
			result += node.getTasks();
		}
		return result;
	}

	@Override
	public String getInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n");
		sb.append(structureName);
		sb.append("\n");
		
		for(HierarchyNode node : nodes) {
			sb.append("\t" + node.getInfo());
		}
		return sb.toString();
	}
	
	@Override
	public void addChildNode(HierarchyNode elementStructura){
		nodes.add(elementStructura);
	}
	
	@Override
	public void deleteChildNode(HierarchyNode elementStructura){
		nodes.remove(elementStructura);
	}
	
	@Override
	public HierarchyNode getChildNode(int i){
		return (HierarchyNode)nodes.get(i);
	}

}
