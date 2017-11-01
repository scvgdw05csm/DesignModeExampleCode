package bridge;

public class MessageSMS implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("send by sms:'" + message + "' to " + toUser);
    }
}
