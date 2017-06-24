package observer;

public class Reader implements Observer {

	private String name;
	
	@Override
	public void update(Subject subject) {
		System.out.println(name + " received news paper, content is:" + ((NewsPaper)subject).getContent());
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
