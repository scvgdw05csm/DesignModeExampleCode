package visitor;

public interface Visitor2 {
    public void visitComposite(Composite composite);
    public void visitLeaf(Leaf leaf);
}
