package composite;

public class Client {

	public static void main(String[] args) {
		Component root = new Composite("Clothes");
		Component c1 = new Composite("Men's clothing");
		Component c2 = new Composite("Women's dress");
		
		Component leaf1 = new Leaf("shirt");
		Component leaf2 = new Leaf("jacket");
		Component leaf3 = new Leaf("skirt");
		Component leaf4 = new Leaf("suit");
		
		root.addChild(c1);
		root.addChild(c2);
		c1.addChild(leaf1);
		c1.addChild(leaf2);
		c2.addChild(leaf3);
		c2.addChild(leaf4);
		
		root.printStruct("");
		System.out.println("---------------------------------------");
		
		root.removeChild(c1);
		root.printStruct("");
		System.out.println("---------------------------------------");
		
//		Component c3 = new Composite("Men's clothing");
//		root.addChild(c1);
//		c1.addChild(c2);
//	    c2.addChild(c3);
	}
}
