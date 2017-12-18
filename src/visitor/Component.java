package visitor;

public abstract class Component {

    public abstract void accept(Visitor2 visitor);
    
    public void addChild(Component child) {
        throw new UnsupportedOperationException("object does not support this function");
    }
    
    public void removeChild(Component child) {
        throw new UnsupportedOperationException("object does not support this function");
    }
    
    public Component getChildren(int index) {
        throw new UnsupportedOperationException("object does not support this function");
    }
}
