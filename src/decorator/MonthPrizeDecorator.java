package decorator;

import java.util.Date;

public class MonthPrizeDecorator extends Decorator {

    public MonthPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        System.out.println(user + " month prize " + prize);
        return money + prize;
    }
}
