package factorymethod;

public class ExportTxtFile implements ExportFileApi {

    @Override
    public boolean export(String data) {
        System.out.println("export:" + data + " to txt");
        return true;
    }

}
