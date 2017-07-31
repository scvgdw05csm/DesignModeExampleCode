package strategy;

public class OldCustomerStrategy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("old customer, 5% discount");
        return goodsPrice * (1 - 0.05);
    }

}
