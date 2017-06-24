package mediator;

public class CDDriver extends Colleague {

    private String data = "";
    
    public CDDriver(Mediator mediator) {
        super(mediator);
    }
    
    public String getData() {
        return data;
    }
    
    public void readCD() {
        data = "designMode,worth better research";
        getMediator().changed(this);
    }
}
