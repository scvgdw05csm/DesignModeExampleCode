package decorator;

import java.util.Date;

public class ConcreteComponent extends Component {

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return 0;
    }
}
