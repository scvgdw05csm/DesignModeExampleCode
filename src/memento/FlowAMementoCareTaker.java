package memento;

public class FlowAMementoCareTaker {

    private FlowAMockMemento memento = null;
    
    public void saveMemento(FlowAMockMemento memento) {
        this.memento = memento;
    }
    
    public FlowAMockMemento retriveMemento() {
        return memento;
    }
}
