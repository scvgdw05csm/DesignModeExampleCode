package memento;

public class Operation implements OperationApi {

    private int result;
    
    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void add(int num) {
        result += num;
    }

    @Override
    public void substract(int num) {
        result -= num;
    }

    @Override
    public Memento createMemento() {
        MementoImpl m = new MementoImpl(result);
        return m;
    }

    @Override
    public void setMemento(Memento memento) {
        result = ((MementoImpl)memento).getResult();
    }

    private static class MementoImpl implements Memento {
        private int result = 0;
        
        public MementoImpl(int result) {
            this.result = result;
        }
        
        public int getResult() {
            return result;
        }
    }
}
