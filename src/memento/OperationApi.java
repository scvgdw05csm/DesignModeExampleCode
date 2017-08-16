package memento;

public interface OperationApi {
    public int getResult();
    public void add(int num);
    public void substract(int num);
    public Memento createMemento();
    public void setMemento(Memento memento);
}
