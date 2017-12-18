package visitor;

public abstract class Customer {
    
    private String customerId;
    private String name;
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    public String getCustomerId() {
        return customerId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void accept(Visitor visitor);
}
 