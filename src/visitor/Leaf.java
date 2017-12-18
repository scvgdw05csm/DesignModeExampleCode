package visitor;

public class Leaf extends Component {

    private String name = "";
    
    public Leaf(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void accept(Visitor2 visitor) {
        visitor.visitLeaf(this);
    }

}
