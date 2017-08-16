package memento;

public class Client2 {

    public static void main(String[] args) {
        OperationApi operation = new Operation();
        
        AddCommand addCmd = new AddCommand(5);
        SubstractCommand substractCmd = new SubstractCommand(3);
        
        addCmd.setOperation(operation);
        substractCmd.setOperation(operation);
        
        Calculator calculator = new Calculator();
        calculator.setAddCmd(addCmd);
        calculator.setSubstractCmd(substractCmd);
        
        calculator.addPressed();
        System.out.println("add once: " + operation.getResult());
        
        calculator.substractPressed();
        System.out.println("substract once: " + operation.getResult());
        
        calculator.undoPressed();
        System.out.println("undo once: " + operation.getResult());
        calculator.undoPressed();
        System.out.println("undo once: " + operation.getResult());
        
        calculator.redoPressed();
        System.out.println("redo once: " + operation.getResult());
        calculator.redoPressed();
        System.out.println("redo once: " + operation.getResult());
    }
}
