package visitor;

public class Client {

    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        
        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("abcGroup");
        os.addElement(cm1);
        
        Customer cm2 = new EnterpriseCustomer();
        cm2.setName("cdeCompany");
        os.addElement(cm2);
        
        Customer cm3 = new PersonalCustomer();
        cm3.setName("zhang3");
        os.addElement(cm3);
        
        ServiceRequestVisitor srVisitor = new ServiceRequestVisitor();
        os.handleRequest(srVisitor);
        
        PredilectionAnalyzeVisitor paVisitor = new PredilectionAnalyzeVisitor();
        os.handleRequest(paVisitor);
        
        WorthAnalyzeVisitor waVisitor = new WorthAnalyzeVisitor();
        os.handleRequest(waVisitor);
    }
}
