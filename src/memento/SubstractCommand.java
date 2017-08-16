package memento;

public class SubstractCommand extends AbstractCommand {

    private int opeNum;
    
    public SubstractCommand(int opeNum) {
        this.opeNum = opeNum;
    }
    
    @Override
    public void execute() {
        operation.substract(opeNum);
    }
}
