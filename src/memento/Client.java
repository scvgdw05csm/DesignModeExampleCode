package memento;

public class Client {

    public static void main(String[] args) {
        FlowAMock mock = new FlowAMock("TestFLow");
        mock.runPhaseOne();
        FlowAMementoCareTaker careTaker = new FlowAMementoCareTaker();
        FlowAMockMemento memento = mock.creatememento();
        careTaker.saveMemento(memento);
        
        mock.schema1();
        
        mock.setMemento(careTaker.retriveMemento());
        
        mock.schema2();
    }
}
