package prototype;

public class EnterpriseOrder implements OrderApi {

    private String enterpriseName;
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

    public String getEnterpriseName() {
        return enterpriseName;
    }
    
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public String toString() {
        return "order enterprise:" + enterpriseName + ", order product:" + productId + ", order number:" + orderProductNum;
    }
    
    @Override
    public OrderApi cloneOrder() {
        EnterpriseOrder order = new EnterpriseOrder();
        order.setEnterpriseName(enterpriseName);
        order.setProductId(productId);
        order.setOrderProductNum(orderProductNum);
        return order;
    }
}
