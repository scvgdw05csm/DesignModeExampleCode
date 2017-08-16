package memento;

public class FlowAMock {

    private String flowName;
    
    private int tempResult;
    
    private String tempState;
    
    public FlowAMock(String flowName) {
        this.flowName = flowName;
    }
    
    public void runPhaseOne() {
        tempResult = 3;
        tempState = "PhaseOne";
    }
    
    public void schema1() {
        tempState += ",Schema1";
        System.out.println(tempState + " : now run " + tempResult);
        tempResult += 11;
    }
    
    public void schema2() {
        tempState += ",Schema2";
        System.out.println(tempState + " : now run " + tempResult);
        tempResult += 22;
    }
    
    public FlowAMockMemento creatememento() {
        return new MementoImpl(tempResult, tempState);
    }
    
    public void setMemento(FlowAMockMemento memento) {
        MementoImpl mementoImpl = (MementoImpl) memento;
        tempResult = mementoImpl.getTempResult();
        tempState = mementoImpl.getTempState();
    }
    
    private static class MementoImpl implements FlowAMockMemento {
        private int tempResult;
        private String tempState;
        
        public MementoImpl(int tempResult, String tempState) {
            this.tempResult = tempResult;
            this.tempState = tempState;
        }
        
        public int getTempResult() {
            return tempResult;
        }
        
        public String getTempState() {
            return tempState;
        }
    }
}
