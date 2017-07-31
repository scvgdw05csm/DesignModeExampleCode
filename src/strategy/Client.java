package strategy;

public class Client {

    public static void main(String[] args) {
        //Strategy strategy = new LargeCustomerStrategy();
        Strategy strategy = new CooperateCustomerStrategy();
        Price ctx = new Price(strategy);
        
        double quote = ctx.quote(1000);
        System.out.println("quote: " + quote);
    }
}
