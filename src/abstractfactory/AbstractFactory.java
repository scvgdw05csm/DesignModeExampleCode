package abstractfactory;

public interface AbstractFactory {
    public CPUApi createCPUApi();
    public MainboardApi createMainboardApi();
}
