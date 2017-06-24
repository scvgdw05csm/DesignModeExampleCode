package factorymethod;

public class Client {

    public static void main(String[] args) {
        ExportOperate operate = new ExportDBOperate();
        operate.export("test data");
    }
}
