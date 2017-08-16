package memento;

public class AddCommand extends AbstractCommand {

    private int opeNum;
    
    public AddCommand(int opeNum) {
        this.opeNum = opeNum;
    }
    
    @Override
    public void execute() {
        operation.add(opeNum);        
    }
}
