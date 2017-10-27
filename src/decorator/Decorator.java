package decorator;

import java.util.Date;

public abstract class Decorator extends Component {

    protected Component c;
    
    public Decorator(Component c) {
        this.c = c;
    }
    
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return c.calcPrize(user, begin, end);
    }
}
