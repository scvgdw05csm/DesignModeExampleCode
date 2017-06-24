package mediator;

public class Client {

    public static void main(String[] args) {
        MotherBoard mediator = new MotherBoard();
        CDDriver cd = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideoCard vc = new VideoCard(mediator);
        SoundCard sc = new SoundCard(mediator);
        
        mediator.setCdDriver(cd);
        mediator.setCPU(cpu);
        mediator.setVideoCard(vc);
        mediator.setSoundCard(sc);
        
        cd.readCD();
    }
}
