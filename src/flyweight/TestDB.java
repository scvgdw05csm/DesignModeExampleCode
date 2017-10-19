package flyweight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestDB {

    public static Collection<String> colDB = new ArrayList<String>();
    
    public static Map<String, String[]> mapDB = new HashMap<String, String[]>();
    
    static {
        colDB.add("zhang3, people, browse, 1");
        colDB.add("li4, people, browse, 1");
        colDB.add("li4, access salary, , 2");
        
        mapDB.put("access salary", new String[]{"salary, browse", "salary, modify"});
        
        for (int i = 0; i < 3; i++) {
            colDB.add("zhang3" + i + ", people, browse, 1");
        }
    }
}
