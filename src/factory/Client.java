package factory;

public class Client {

	public static void main(String[] args) {
		Api api = Factory.createApi();
		api.operation("simple factory test");
	}
}
