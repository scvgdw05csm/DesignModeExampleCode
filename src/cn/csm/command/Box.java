package cn.csm.command;

public class Box {

	private Command openCommand;
	private Command resetCommand;
	
	public void setOpenCommand(Command command) {
		openCommand = command;
	}
	
	public void openButtonPressed() {
		openCommand.execute();
	}
	
	public void setResetCommand(Command command) {
		resetCommand = command;
	}
	
	public void resetButtonPressed() {
		resetCommand.execute();
	}
}
