package flyweight;

public class AuthorizationFlyweight implements Flyweight {

    private String securityEntity;
    
    private String permit;
    
    public AuthorizationFlyweight(String state) {
        String ss[] = state.split(",");
        securityEntity = ss[0].trim();
        permit = ss[1].trim();
    }
    
    public String getSecurityEntity() {
        return securityEntity;
    }
    
    public String getPermit() {
        return permit;
    }
    
    @Override
    public boolean match(String securityEntity, String permit) {
        if (this.securityEntity.equals(securityEntity) && this.permit.equals(permit)) {
            return true;
        }
        return false;
    }

    @Override
    public void add(Flyweight f) {
        throw new UnsupportedOperationException("function not supported");
    }
}
