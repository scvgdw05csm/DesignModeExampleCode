package factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {

    public static Api createApi() {
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = Factory.class.getResourceAsStream("FactoryTest.properties");
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Api api = null;
        try {
            api = (Api) Class.forName(p.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
