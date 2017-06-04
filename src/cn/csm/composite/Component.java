package cn.csm.composite;

import java.util.List;

public abstract class Component {

	private Component parent = null;
	private String componentPath = "";
	
	public Component getParent() {
		return parent;
	}
	
	public String getComponentPath() {
		return componentPath;
	}
	
	public void setComponentPath(String componentPath) {
		this.componentPath = componentPath;
	}
	
	public abstract String getName();
	
	public void setParent(Component parent) {
		this.parent = parent;
	}
	
	public List<Component> getChildren() {
		throw new UnsupportedOperationException("object does not support this operation");
	}
	
	public abstract void printStruct(String preStr);
	
	public void addChild(Component child) {
		throw new UnsupportedOperationException("object does not support this operation");
	}
	
	public void removeChild(Component child) {
		throw new UnsupportedOperationException("object does not support this operation");
	}
	
	public Component getChildren(int index) {
		throw new UnsupportedOperationException("object does not support this operation");
	}
}
