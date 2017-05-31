package cn.csm.command;

public class Client {

	public static void main(String[] args) {
		MainBoardApi mainBoard = new GigaMainBoard();
		OpenCommand openCommand = new OpenCommand(mainBoard);
		ResetCommand resetCommand = new ResetCommand(mainBoard);
		Box box = new Box();
		box.setOpenCommand(openCommand);
		box.setResetCommand(resetCommand);
		
		System.out.println("right configuration------------->");
		System.out.println(">>>press power button:>>>");
		box.openButtonPressed();
		System.out.println(">>>press reset button:>>>");
		box.resetButtonPressed();
		
		box.setOpenCommand(resetCommand);
		box.setResetCommand(openCommand);
		System.out.println("wrong configuration------------->");
		System.out.println(">>>press power button:>>>");
		box.openButtonPressed();
		System.out.println(">>>press reset button:>>>");
		box.resetButtonPressed();
	}
}
