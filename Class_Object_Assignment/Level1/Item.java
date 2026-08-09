package Class_Object_Assignment.Level1;

import java.util.Scanner;

public class Item {
    private String itemName;
    private int itemCode;
    private int price;

    Item(String name,int code,int p)
    {
        itemCode = code;
        itemName = name;
        price = p;
    }

    public void itemDetails()
    {
        System.out.println("Item Details : ");
        System.out.println("Name : "+itemName);
        System.out.println("Code : "+itemCode);
        System.out.println("Price : "+price);
    }

    public int totalCost(int quantity)
    {
        return price * quantity;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int code = sc.nextInt();
        int price = sc.nextInt();

        int quantity = sc.nextInt();

        Item i = new Item(name,code, price);
        i.itemDetails();

        System.out.println("Total cost : "+i.totalCost(quantity));
    }
}
