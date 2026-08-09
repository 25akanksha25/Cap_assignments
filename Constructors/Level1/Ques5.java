package Constructors.Level1;

class Book
{
    private String title;
    private String author;
    private int price;
    private boolean availability;

    Book()
    {
        title = "unknown";
        author = "unknown";
        price = 0;
        availability = false;
    }

    Book(String title, String author, int price, boolean availability)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }


    private String borrowBook()
    {
        if(availability)
        {
            return "The Book "+title+ " is available to borrow";
        }
        else
        {
            return "Sorry you can't borrow the book";
        }
    }

    public void displayDetails()
    {
        System.out.println("Details: ");
        System.out.println("Title : "+title+"\nAuthor : "+author+"\nPrice : "+price+"\nAvailability : "+borrowBook());
    }

}
public class Ques5 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java","Ram",3000,true);

        System.out.println("Default............");
        b1.displayDetails();

        System.out.println("Parameterized.........");
        b2.displayDetails();
    }
    
}
