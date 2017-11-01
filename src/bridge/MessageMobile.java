package bridge;

public class MessageMobile implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("send by mobile:'" + message + "' to " + toUser);
    }
}
