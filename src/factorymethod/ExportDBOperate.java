package factorymethod;

public class ExportDBOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDB();
    }

}
