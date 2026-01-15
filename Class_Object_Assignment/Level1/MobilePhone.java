package Class_Object_Assignment.Level1;

import java.util.Scanner;

public class MobilePhone {
    private String brand;
    private String model;
    private int price;

    MobilePhone(String b, String m, int p)
    {
        brand = b;
        model = m;
        price = p;
    }

    public void MobileDetails()
    {
        System.out.println("Mobile Details : ");
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        String model = sc.nextLine();
        int price = sc.nextInt();
    
        MobilePhone b = new MobilePhone(brand, model, price);
        b.MobileDetails();
    }
}
