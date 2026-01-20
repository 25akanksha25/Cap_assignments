package Inheritance.Multilevel_Inheritance;


class Order
{
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate)
    {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus()
    {
        System.out.println("Order Details : "+"\nOrder Id : "+orderId+"\nOrder Date : "+orderDate);
    }
}
class ShippedOrder extends Order
{
    int trackingNumber;
    ShippedOrder(int orderId,String orderDate, int trackingNumber)
    {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    
    public void getOrderStatus()
    {
        System.out.println("The Order is Shipped");
    }
}
class DeliveredOrder extends ShippedOrder
{
    String deliveryDate;
    DeliveredOrder(int orderId,String orderDate, int trackingNumber,String deliveryDate)
    {
        super(orderId, orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public void getOrderStatus()
    {
        System.out.println("The order is out for delivery");
    }

}
public class Program1 {
    public static void main(String[] args) {
        Order o1 = new Order(123456, "15 June 2026");
        Order o2 = new ShippedOrder(123456, "15 June 2026", 1212);
        Order o3 = new DeliveredOrder(123456, "15 June 2026", 1212, "21 June 2026");
        o1.getOrderStatus();
        o2.getOrderStatus();
        o3.getOrderStatus();

    }
    
}
