package strategy;

public class Price {

    private Strategy strategy = null;
    
    public Price(Strategy aStrategy) {
        strategy = aStrategy;
    }
    
    public double quote(double goodsPrice) {
        return strategy.calcPrice(goodsPrice);
    }
}
