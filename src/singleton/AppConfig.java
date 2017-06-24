package singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    private static AppConfig instance = new AppConfig();

    private String parameterA;
    private String parameterB;

    private AppConfig() {
        readConfig();
    }

    public static AppConfig getInstance() {
        return instance;
    }

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

    private void readConfig() {
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = AppConfig.class.getResourceAsStream("AppConfig.properties");
            p.load(in);
            parameterA = p.getProperty("paramA");
            parameterB = p.getProperty("paramB");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
