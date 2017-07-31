package strategy;

public class LargeCustomerStrategy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("large customer, 10% discount");
        return goodsPrice * (1 - 0.1);
    }

}
