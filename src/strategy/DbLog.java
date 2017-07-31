package strategy;

public class DbLog implements LogStrategy {

    @Override
    public void log(String msg) {
        if (msg != null && msg.trim().length() > 5) {
            int a = 5/0;
        }
        System.out.println("now set '" + msg + "' into database");
    }
}
