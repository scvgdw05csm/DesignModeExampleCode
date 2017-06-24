package prototype;

public class PersonalOrder implements OrderApi {

    private String customerName;
    private String productId;
    private int orderProductNum = 0;
    
    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        orderProductNum = num;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public String toString() {
        return "order personal:" + customerName + ", order product:" + productId + ", order number:" + orderProductNum;
    }
    
    @Override
    public OrderApi cloneOrder() {
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(customerName);
        order.setProductId(productId);
        order.setOrderProductNum(orderProductNum);
        return order;
    }
}
