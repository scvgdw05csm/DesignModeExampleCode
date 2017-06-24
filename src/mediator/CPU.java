package mediator;

public class CPU extends Colleague {

    private String videoData = "";
    private String soundData = "";
    
    public CPU(Mediator mediator) {
        super(mediator);
    }
    
    public String getVideoData() {
        return videoData;
    }
    
    public String getSoundData() {
        return soundData;
    }
    
    public void executeData(String data) {
        String[] ss = data.split(",");
        videoData = ss[0];
        soundData = ss[1];
        getMediator().changed(this);
    }
}
