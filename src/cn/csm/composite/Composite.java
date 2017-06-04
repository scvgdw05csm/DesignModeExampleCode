package cn.csm.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> childComponents = null;
	
	private String name = "";
	
	public Composite(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void addChild(Component child) {
		if (childComponents == null) {
			childComponents = new ArrayList<Component>();
		}
		childComponents.add(child);
		child.setParent(this);
		
		if (getComponentPath() == null || getComponentPath().trim().length() == 0) {
			setComponentPath(name);
		}
		
		if (getComponentPath().startsWith(child.getName() + ".")) {
			throw new IllegalArgumentException("on this component path, component " + child.getName() + " is already added");
		} else {
			if (getComponentPath().indexOf("." + child.getName()) < 0) {
				String componentPath = getComponentPath() + "." + child.getName();
				child.setComponentPath(componentPath);
			} else {
				throw new IllegalArgumentException("on this component path, component " + child.getName() + " is already added");
			}
		}
	}
	
	@Override
	public void removeChild(Component child) {
		if (childComponents != null) {
			int idx = childComponents.indexOf(child);
			if (idx != -1) {
				for (Component c : child.getChildren()) {
					c.setParent(this);
					childComponents.add(c);
				}
				childComponents.remove(idx);
			}
		}
	}
	
	@Override
	public List<Component> getChildren() {
		return childComponents;
	}
	
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr + "+" + name);
		if (childComponents != null) {
			preStr += " ";
			for (Component c : childComponents) {
				c.printStruct(preStr);
			}
		}
	}
}
