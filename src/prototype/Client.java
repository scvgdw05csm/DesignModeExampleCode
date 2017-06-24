package prototype;

public class Client {

    public static void main(String args[]) {
        PersonalOrder op = new PersonalOrder();
        op.setOrderProductNum(2925);
        op.setCustomerName("zhang3");
        op.setProductId("P0001");
        
        OrderBusiness ob = new OrderBusiness();
        ob.saveOrder(op);
    }
}
