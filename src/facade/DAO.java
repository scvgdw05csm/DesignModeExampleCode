package facade;

public class DAO {

    public void generate() {
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if (cm.isNeedGenDAO()) {
            System.out.println("generating DAO files");
        }
    }
}
