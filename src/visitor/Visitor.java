package visitor;

public interface Visitor {
    public void visitEnterpriseCustomer(EnterpriseCustomer ec);
    public void visitPersonalCustomer(PersonalCustomer pc);
}
