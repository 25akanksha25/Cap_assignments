package Constructors.Instance_Class_Methods;

class Product
{
    String productName;
    int price;
    static int totalProducts = 0;

    Product(String productName, int price)
    {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayDetails()
    {
        System.out.println("Details : ");
        System.out.println("Product Name : "+productName+ "\nPrice : "+price);
    }

    public static void totalProducts()
    {
        System.out.println("Total Products Created : "+totalProducts);
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Product p = new Product("Books",500);
        Product p2 = new Product("Games",1500);
        p.displayDetails();
        Product.totalProducts();
        
    }
    
}
