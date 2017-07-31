package strategy;

public class PaymentContext {

    private String userName = null;
    
    private double money = 0.0;
    
    private PaymentStrategy strategy = null;
    
    public PaymentContext(String userName, double money, PaymentStrategy strategy) {
        this.userName = userName;
        this.money = money;
        this.strategy = strategy;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public double getMoney() {
        return money;
    }
    
    public void payNow() {
        strategy.pay(this);
    }
}
