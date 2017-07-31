package strategy;

public class Client2 {

    public static void main(String[] args) {
        PaymentStrategy strategyRMB = new RMBCash();
        PaymentStrategy strategyDollar = new DollarCash();
        
        PaymentContext ctx1 = new PaymentContext("li", 5000, strategyRMB);
        ctx1.payNow();
        
        PaymentContext ctx2 = new PaymentContext("Petter", 8000, strategyDollar);
        ctx2.payNow();
        
        PaymentStrategy strategyCard = new Card();
        PaymentContext ctx3 = new PaymentContext2("wang", 9000, "010998877656", strategyCard);
        ctx3.payNow();
        
        PaymentStrategy strategyCard2 = new Card2("010998877656");
        PaymentContext ctx4 = new PaymentContext("zhang", 9000, strategyCard2);
        ctx4.payNow();
    }
}
