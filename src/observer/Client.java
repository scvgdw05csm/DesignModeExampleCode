package observer;

public class Client {

	public static void main(String[] args) {
		NewsPaper subject = new NewsPaper();
		
		Reader reader1 = new Reader();
		reader1.setName("zhang3");
		Reader reader2 = new Reader();
		reader2.setName("li4");
		Reader reader3 = new Reader();
		reader3.setName("wang5");
		
		subject.attach(reader1);
		subject.attach(reader2);
		subject.attach(reader3);
		
		subject.setContent("content is observer mode");
	}
}
