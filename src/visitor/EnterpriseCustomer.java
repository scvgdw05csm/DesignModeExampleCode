package visitor;

public class EnterpriseCustomer extends Customer {

    private String linkman;
    private String linkTelephone;
    private String registerAddress;
    
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }
    
    public String getLinkman() {
        return linkman;
    }
    
    public void setLinkTelephone(String linkTelephone) {
        this.linkTelephone = linkTelephone;
    }
    
    public String getLinkTelephone() {
        return linkTelephone;
    }
    
    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }
    
    public String getRegisterAddress() {
        return registerAddress;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitEnterpriseCustomer(this);
    }

}
