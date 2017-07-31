package strategy;

public class FileLog implements LogStrategy {

    @Override
    public void log(String msg) {
        System.out.println("now set '" + msg + "' into file");
    }
}
