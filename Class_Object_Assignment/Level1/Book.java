package Class_Object_Assignment.Level1;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;

    Book(String t, String a, double p)
    {
        title = t;
        author = a;
        price = p;
    }

    public void displayDetails()
    {
        System.out.println("Title Of Book : "+title);
        System.out.println("Author of Book : "+author);
        System.out.println("Price : "+price);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();

        Book b = new Book(title, author, price);
        b.displayDetails();
    }
    
}
