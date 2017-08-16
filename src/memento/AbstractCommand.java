package memento;

public abstract class AbstractCommand implements Command {

    @Override
    public abstract void execute();
    
    protected OperationApi operation = null;
    
    public void setOperation(OperationApi operation) {
        this.operation = operation;
    }
    
    @Override
    public Memento createMemento() {
        return operation.createMemento();
    }
    
    @Override
    public void redo(Memento m) {
        operation.setMemento(m);
    }
    
    @Override
    public void undo(Memento m) {
        operation.setMemento(m);
    }
}
