package bridge;

public class MessageEmail implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("send by email:'" + message + "' to " + toUser);
    }
}
