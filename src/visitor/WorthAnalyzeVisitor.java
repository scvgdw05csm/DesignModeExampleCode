package visitor;

public class WorthAnalyzeVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        System.out.println("now analyze enterprise customer " + ec.getName() + "'s worth");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println("now analyze personal customer " + pc.getName() + "'s worth");
    }

}
