package factorymethod;

public abstract class ExportOperate {

    public boolean export(String data) {
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

    protected abstract ExportFileApi factoryMethod();
}
