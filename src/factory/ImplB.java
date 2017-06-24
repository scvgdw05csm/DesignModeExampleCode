package factory;

public class ImplB implements Api {

	@Override
	public void operation(String s) {
		System.out.println("implB s:" + s);
	}

}
