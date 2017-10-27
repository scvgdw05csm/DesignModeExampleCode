package decorator;

public class Client {

    public static void main(String[] args) {
        Component c1 = new ConcreteComponent();
        
        Decorator d1 = new MonthPrizeDecorator(c1);
        Decorator d2 = new SumPrizeDecorator(d1);
        
        double zs = d2.calcPrize("zhang3", null, null);
        System.out.println("zhang3 should get " + zs);
        
        double ls = d2.calcPrize("li4", null, null);
        System.out.println("li4 should get " + ls);
        
        Decorator d3 = new GroupPrizeDecorator(d2);
        
        double ww = d3.calcPrize("wang5", null, null);
        System.out.println("wang5 should get " + ww);
    }
}
