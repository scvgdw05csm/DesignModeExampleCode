package visitor;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectStructure {

    private Collection<Customer> col = new ArrayList<Customer>();
    
    public void handleRequest(Visitor visitor) {
        for (Customer cm : col) {
            cm.accept(visitor);
        }
    }
    
    public void addElement(Customer ele) {
        col.add(ele);
    }
}
