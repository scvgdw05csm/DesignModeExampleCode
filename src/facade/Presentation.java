package facade;

public class Presentation {

    public void generate() {
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if (cm.isNeedGenPresentation()) {
            System.out.println("generating presentation files");
        }
    }
}
