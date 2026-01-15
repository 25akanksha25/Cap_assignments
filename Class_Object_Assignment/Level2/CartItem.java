package Class_Object_Assignment.Level2;

import java.util.Scanner;

public class CartItem {
    private String itemName;
    private int price;
    private int quantity;


    CartItem(String item , int p,int q)
    {
        itemName = item;
        price = p;
        quantity = q;
    }

    public void addItem(int q)
    {
        quantity += q;
    }

    public void removeItem(int q)
    {
        if(q <= quantity)
        {
            quantity -= q;
        }
    }


    public double totalCost()
    {
        return quantity * price;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int price = sc.nextInt();
        int quantity = sc.nextInt();

        CartItem c = new CartItem(name, price, quantity);

        int add = sc.nextInt();
        c.addItem(add);

        int rem = sc.nextInt();
        c.removeItem(rem);

        System.out.println("Total Cost : "+c.totalCost());
    }


    
}
