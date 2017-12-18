package visitor;

public class PrintNameVisitor implements Visitor2 {

    @Override
    public void visitComposite(Composite composite) {
        System.out.println("composite:" + composite.getName());
    }

    @Override
    public void visitLeaf(Leaf leaf) {
        System.out.println("leaf:" + leaf.getName());
    }

}
