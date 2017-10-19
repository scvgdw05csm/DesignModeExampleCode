package flyweight;

public interface Flyweight {

    public boolean match(String securityEntity, String permit);
    
    public void add(Flyweight f);
}
