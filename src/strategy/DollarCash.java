package strategy;

public class DollarCash implements PaymentStrategy {

    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("now give: " + ctx.getUserName() + " " + ctx.getMoney() + " Dollar");
    }
}
