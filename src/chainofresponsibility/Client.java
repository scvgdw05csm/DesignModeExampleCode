package chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        Handler h1 = new GeneralManager();
        Handler h2 = new DepManager();
        Handler h3 = new ProjectManager();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);
        
        String ret1 = h3.handleFeeRequest("li", 300);
        System.out.println(ret1);
        String ret2 = h3.handleFeeRequest("zhang", 300);
        System.out.println(ret2);
        
        String ret3 = h3.handleFeeRequest("li", 600);
        System.out.println(ret3);
        String ret4 = h3.handleFeeRequest("zhang", 600);
        System.out.println(ret4);
        
        String ret5 = h3.handleFeeRequest("li", 1200);
        System.out.println(ret5);
        String ret6 = h3.handleFeeRequest("zhang", 1200);
        System.out.println(ret6);
    }
}
