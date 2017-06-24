package prototype;

public interface OrderApi {
    public int getOrderProductNum();
    public void setOrderProductNum(int num);
    public OrderApi cloneOrder();
}
