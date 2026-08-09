package Static_Final_InstanceOf.Level1;


class Product
{
    private final int productId;
    private static double discount = 10;

    private String productName;
    private double price;
    private int quantity;

    Product(String productName,double price,int quantity,int productId)
    {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    public static void updatediscount(double newDis)
    {

        discount = newDis;
    }

    public void displayDetails(Object obj)
    {
        if(obj instanceof Product)
        {
            System.out.println("Product Id : "+productId+"\nProduct Name : "+productName+"\nPrice : "+price+"\nQuantity : "+quantity+"\nDiscount : "+discount);
        }
    } 
}
public class Program4 {
    public static void main(String[] args) {
        Product e = new Product("Toys",1200,5,123456);
        Product.updatediscount(20);
        e.displayDetails(e);

    }
    
}
