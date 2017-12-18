package visitor;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> childComponents = new ArrayList<Component>();
    
    private String name = "";
    
    public Composite(String name) {
        this.name = name;
    }
    
    public void addChild(Component child) {
        childComponents.add(child);
    }
    
    public String getName() {
        return name;
    }
    
    public List<Component> getChildComponents() {
        return childComponents;
    }
    
    @Override
    public void accept(Visitor2 visitor) {
        visitor.visitComposite(this);
        //NOTE: annotation for PrintStructVisitor
//        for (Component c : childComponents) {
//            c.accept(visitor);
//        }
    }

}
