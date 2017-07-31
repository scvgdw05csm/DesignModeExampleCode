package strategy;

public class NormalCustomerStrategy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("normal customer, no discount");
        return goodsPrice;
    }
}
