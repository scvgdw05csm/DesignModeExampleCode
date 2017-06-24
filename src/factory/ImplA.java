package factory;

public class ImplA implements Api {

	@Override
	public void operation(String s) {
		System.out.println("implA s:" + s);
	}

}
