package visitor;

public class ServiceRequestVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        System.out.println(ec.getName() + " request service");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println("customer " + pc.getName() + " request service");
    }

}
