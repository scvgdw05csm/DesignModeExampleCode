package flyweight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecurityMgr {

    private static SecurityMgr securityMgr = new SecurityMgr();
    
    private SecurityMgr() {}
    
    public static SecurityMgr getInstance() {
        return securityMgr;
    }
    
    private Map<String, Collection<Flyweight>> map = new HashMap<String, Collection<Flyweight>>();
    
    public void login(String user) {
        Collection<Flyweight> col = queryByUser(user);
        map.put(user, col);
    }
    
    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> col = map.get(user);
        
        System.out.println("test:" + securityEntity + " permit:" + permit + " map.size:" + map.size());
        
        if (col == null || col.size() == 0) {
            System.out.println(user + " has not login or get any permissions");
            return false;
        }
        
        for (Flyweight fm : col) {
            System.out.println("fm==" + fm);
            if (fm.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }
    
    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col = new ArrayList<Flyweight>();
        for (String s : TestDB.colDB) {
            String ss[] = s.split(",");
            if (ss[0].trim().equals(user)) {
                Flyweight fm = null;
                if (ss[3].trim().equals("2")) {
                    fm = new UnsharedConcreteFlyweight();
                    String tempSs[] = TestDB.mapDB.get(ss[1].trim());
                    for (String tempS : tempSs) {
                        Flyweight tempFm = FlyweightFactory.getInstance().getFlyweight(tempS);
                        fm.add(tempFm);
                    }
                } else {
                    fm = FlyweightFactory.getInstance().getFlyweight(ss[1].trim() + "," + ss[2].trim());
                }
                col.add(fm);
            }
        }
        return col;
    }
}
