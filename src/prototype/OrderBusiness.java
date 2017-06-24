package prototype;

public class OrderBusiness {

    public void saveOrder(OrderApi order) {
        while (order.getOrderProductNum() > 1000) {
            OrderApi newOrder = order.cloneOrder();
            newOrder.setOrderProductNum(1000);
            order.setOrderProductNum(order.getOrderProductNum() - 1000);
            System.out.println("divide happened:" + newOrder);
        }
        System.out.println("order:" + order);
    }
}
