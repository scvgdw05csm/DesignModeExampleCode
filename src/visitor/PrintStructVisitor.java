package visitor;

public class PrintStructVisitor implements Visitor2 {

    private String preStr = "";
    
    @Override
    public void visitComposite(Composite composite) {
        System.out.println(preStr + "+" + composite.getName());
        if (composite.getChildComponents() != null) {
            preStr += " ";
            for (Component c : composite.getChildComponents()) {
                c.accept(this);
            }
            preStr = preStr.substring(0, preStr.length() - 1);
        }
    }

    @Override
    public void visitLeaf(Leaf leaf) {
        System.out.println(preStr + "-" + leaf.getName());
    }

}
