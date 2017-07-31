package strategy;

public class Card implements PaymentStrategy {

    @Override
    public void pay(PaymentContext ctx) {
        PaymentContext2 ctx2 = (PaymentContext2) ctx;
        System.out.println("now give: " + ctx2.getUserName() + "'s account " + ctx2.getAccount() + " " + ctx2.getMoney() + " RMB");
    }
}
