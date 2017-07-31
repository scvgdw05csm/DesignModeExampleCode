package strategy;

public class Card2 implements PaymentStrategy {

    private String account = "";
    
    public Card2(String account) {
        this.account = account;
    }
    
    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("now give: " + ctx.getUserName() + "'s account " + account + " " + ctx.getMoney() + " RMB");
    }
}
