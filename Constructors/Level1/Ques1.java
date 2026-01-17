package Constructors.Level1;

class Book
{
    private String title;
    private String author;
    private int price;

    Book(String title,String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book()
    {
        title = "invalid";
        author = "invalid";
        price = 0;
    }

    public void displayDetails()
    {
        System.out.println("title : "+title);
        System.out.println("author : "+author);
        System.out.println("price : "+price);

    }
}


public class Ques1 {
    public static void main(String[] args) {
        Book b1 = new Book("Jungle Book","J K Rowling", 5000);
        Book b2 = new Book();
        System.out.println("Parameterized..........");
        b1.displayDetails();
        System.out.println("Default...........");
        b2.displayDetails();

    }
    
}
