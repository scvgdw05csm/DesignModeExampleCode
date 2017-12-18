package visitor;

public class ObjectStructure2 {

    private Component root = null;
    
    public void handleRequest(Visitor2 visitor) {
        if (root != null) {
            root.accept(visitor);
        }
    }
    
    public void setRoot(Component ele) {
        root = ele;
    }
}
