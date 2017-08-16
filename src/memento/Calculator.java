package memento;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Command> undoCmds = new ArrayList<Command>();
    
    private List<Command> redoCmds = new ArrayList<Command>();
    
    private List<Memento[]> undoMementos = new ArrayList<Memento[]>();
    
    private List<Memento[]> redoMementos = new ArrayList<Memento[]>();
    
    private Command addCmd = null;
    private Command substractCmd = null;
    
    public void setAddCmd(Command addCmd) {
        this.addCmd = addCmd;
    }
    
    public void setSubstractCmd(Command substractCmd) {
        this.substractCmd = substractCmd;
    }
    
    public void addPressed() {
        Memento m1 = addCmd.createMemento();
        addCmd.execute();
        undoCmds.add(addCmd);
        
        Memento m2 = addCmd.createMemento();
        undoMementos.add(new Memento[] {m1, m2});
    }
    
    public void substractPressed() {
        Memento m1 = substractCmd.createMemento();
        substractCmd.execute();
        undoCmds.add(substractCmd);
        
        Memento m2 = substractCmd.createMemento();
        undoMementos.add(new Memento[] {m1, m2});
    }
    
    public void undoPressed() {
        if (undoCmds.size() > 0) {
            Command cmd = undoCmds.remove(undoCmds.size() - 1);
            Memento[] ms = undoMementos.remove(undoMementos.size() - 1);
            cmd.undo(ms[0]);
            
            redoCmds.add(cmd);
            redoMementos.add(ms);
        } else {
            System.out.println("no undo cmd");
        }
    }
    
    public void redoPressed() {
        if (redoCmds.size() > 0) {
            Command cmd = redoCmds.remove(redoCmds.size() - 1);
            Memento[] ms = redoMementos.remove(redoMementos.size() - 1);
            cmd.redo(ms[1]);
            
            undoCmds.add(cmd);
            undoMementos.add(ms);
        } else {
            System.out.println("no redo cmd");
        }
    }
}
