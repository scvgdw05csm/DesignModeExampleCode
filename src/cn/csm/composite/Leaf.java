package cn.csm.composite;

public class Leaf extends Component {

	private String name = "";
	
	public Leaf(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr + "-" + name);
	}
}
