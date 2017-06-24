package factorymethod;

public class ExportDB implements ExportFileApi {

    @Override
    public boolean export(String data) {
        System.out.println("export:" + data + " to db");
        return true;
    }

}
