package cn.csm.command;

public class GigaMainBoard implements MainBoardApi {

	@Override
	public void open() {
		System.out.println("Giga main board is now setup, please wait");
		System.out.println("connecting power...");
		System.out.println("checking device...");
		System.out.println("loading system...");
		System.out.println("machine is processing...");
		System.out.println("machine is ready");
	}
	
	@Override
	public void reset() {
		System.out.println("Giga main board is now restart, please wait");
		System.out.println("machine is ready");
	}
}
