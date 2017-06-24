package abstractfactory;

public class ComputerEngineer {

    private CPUApi cpu = null;

    private MainboardApi mainboard = null;

    public void makeComputer(AbstractFactory schema) {
        prepareHardwares(schema);
    }

    private void prepareHardwares(AbstractFactory schema) {
        cpu = schema.createCPUApi();
        mainboard = schema.createMainboardApi();

        cpu.calculate();
        mainboard.installCPU();
    }
}
