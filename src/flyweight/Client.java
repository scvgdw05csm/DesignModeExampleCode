package flyweight;

public class Client {

    public static void main(String[] args) {
        SecurityMgr mgr = SecurityMgr.getInstance();
        mgr.login("zhang3");
        mgr.login("li4");
        boolean f1 = mgr.hasPermit("zhang3", "salary", "browse");
        boolean f2 = mgr.hasPermit("li4", "salary", "browse");
        boolean f3 = mgr.hasPermit("li4", "salary", "modify");
        
        System.out.println("f1==" + f1);
        System.out.println("f2==" + f2);
        System.out.println("f3==" + f3);
        
        for (int i = 0; i < 3; i++) {
            mgr.login("zhang3" + i);
            mgr.hasPermit("zhang3" + i, "salary", "browse");
        }
    }
}
