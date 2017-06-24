package abstractfactory;

public class AMDCPU implements CPUApi {

    private int pins = 0;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now in AMD CPU, pins=" + pins);
    }

}
