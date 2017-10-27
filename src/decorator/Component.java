package decorator;

import java.util.Date;

public abstract class Component {

    public abstract double calcPrize(String user, Date begin, Date end);
}
