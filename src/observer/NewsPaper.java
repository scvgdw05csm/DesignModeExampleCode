package observer;

public class NewsPaper extends Subject {

	private String content;
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
		notifyObservers();
	}
}
