package bridge;

public class Client {

    public static void main(String[] args) {
        MessageImplementor impl = new MessageSMS();
        AbstractMessage m = new CommonMessage(impl);
        m.sendMessage("please take a cup of tea", "li");
        
        m = new UrgencyMessage(impl);
        m.sendMessage("please take a cup of tea", "li");
        
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("please take a cup of tea", "li");
        
        impl = new MessageMobile();
        m = new CommonMessage(impl);
        m.sendMessage("please take a cup of tea", "li");
        
        m = new UrgencyMessage(impl);
        m.sendMessage("please take a cup of tea", "li");
        
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("please take a cup of tea", "li");
    }
}
