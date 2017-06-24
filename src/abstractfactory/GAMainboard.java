package abstractfactory;

public class GAMainboard implements MainboardApi {

    private int cpuHoles = 0;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("now in GAMainboard, cpuHoles=" + cpuHoles);
    }

}
