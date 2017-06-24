package facade;

public class ConfigManager {

    private static ConfigManager manager = null;
    private static ConfigModel cm = null;

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (manager == null) {
            manager = new ConfigManager();
            cm = new ConfigModel();
        }
        return manager;
    }

    public ConfigModel getConfigData() {
        return cm;
    }
}
