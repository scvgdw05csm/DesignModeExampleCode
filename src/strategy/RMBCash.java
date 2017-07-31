package strategy;

public class RMBCash implements PaymentStrategy {

    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("now give: " + ctx.getUserName() + " " + ctx.getMoney() + " RMB");
    }
}
