package strategy;

public class CooperateCustomerStrategy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("cooperate customer, 20% discount");
        return goodsPrice * (1 - 0.2);
    }
}
