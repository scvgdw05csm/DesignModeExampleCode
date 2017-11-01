package bridge;

public class SpecialUrgencyMessage extends AbstractMessage {

    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }
    
    public void hurry(String messageId) {
        // TODO
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "special urgency:" + message;
        super.sendMessage(message, toUser);
    }
}
