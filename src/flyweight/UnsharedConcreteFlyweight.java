package flyweight;

import java.util.ArrayList;
import java.util.List;

public class UnsharedConcreteFlyweight implements Flyweight {

    private List<Flyweight> list = new ArrayList<Flyweight>();
    
    @Override
    public boolean match(String securityEntity, String permit) {
        for (Flyweight f : list) {
            if (f.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void add(Flyweight f) {
        list.add(f);
    }
}
