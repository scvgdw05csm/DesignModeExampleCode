package mediator;

public class MotherBoard implements Mediator {

    private CDDriver cdDriver = null;
    private CPU cpu = null;
    private VideoCard videoCard = null;
    private SoundCard soundCard = null;
    
    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }
    
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }
    
    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
    
    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
    
    @Override
    public void changed(Colleague colleague) {
        if (colleague == cdDriver) {
            opeCDDriverReadData((CDDriver) colleague);
        } else if (colleague == cpu) {
            opeCPU((CPU) colleague);
        }
    }
    
    private void opeCDDriverReadData(CDDriver cd) {
        String data = cd.getData();
        cpu.executeData(data);
    }
    
    private void opeCPU(CPU cpu) {
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        videoCard.showData(videoData);
        soundCard.soundData(soundData);
    }
}
