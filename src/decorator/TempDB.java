package decorator;

import java.util.HashMap;
import java.util.Map;

public class TempDB {

    private TempDB() {}
    
    public static Map<String, Double> mapMonthSaleMoney = new HashMap<String, Double>();
    
    static {
        mapMonthSaleMoney.put("zhang3", 10000.0);
        mapMonthSaleMoney.put("li4", 20000.0);
        mapMonthSaleMoney.put("wang5", 30000.0);
    }
}
