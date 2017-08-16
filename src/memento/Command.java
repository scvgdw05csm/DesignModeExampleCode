package memento;

public interface Command {
    public void execute();
    public void undo(Memento m);
    public void redo(Memento m);
    public Memento createMemento();
}
