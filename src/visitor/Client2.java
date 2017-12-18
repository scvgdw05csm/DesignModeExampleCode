package visitor;

public class Client2 {

    public static void main(String[] args) {
        Component root = new Composite("clothing");
        Component c1 = new Composite("men's clothing");
        Component c2 = new Composite("suite-dress");
        
        Component leaf1 = new Leaf("shirts");
        Component leaf2 = new Leaf("jacket");
        Component leaf3 = new Leaf("skirts");
        Component leaf4 = new Leaf("suits");
        
        root.addChild(c1);
        root.addChild(c2);
        
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        
        c2.addChild(leaf3);
        c2.addChild(leaf4);

        //NOTE: annotation for PrintStructVisitor
//        ObjectStructure2 os = new ObjectStructure2();
//        os.setRoot(root);
//        
//        Visitor2 psVisitor = new PrintNameVisitor();
//        os.handleRequest(psVisitor);
        Visitor2 psVisitor = new PrintStructVisitor();
        root.accept(psVisitor);
    }
}
