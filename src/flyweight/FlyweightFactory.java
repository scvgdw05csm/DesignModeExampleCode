package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static FlyweightFactory factory = new FlyweightFactory();
    
    private FlyweightFactory() {}
    
    public static FlyweightFactory getInstance() {
        return factory;
    }
    
    private Map<String ,Flyweight> fsMap = new HashMap<String, Flyweight>();
    
    public Flyweight getFlyweight(String key) {
        Flyweight f= fsMap.get(key);
        if (f == null) {
            f = new AuthorizationFlyweight(key);
            fsMap.put(key, f);
        }
        return f;
    }
}
