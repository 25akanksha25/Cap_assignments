package Object_Oriented_Design_Principles.Assisted_Problems;

import java.util.ArrayList;
import java.util.List;

class Book
{
    private String title;
    private String author;

    Book(String title,String author)
    {
        this.title = title;
        this.author = author;
    }
    
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    
}

class Library
{
    private String name;
    private List<Book> booklist;

    Library(String name)
    {
        this.name = name;
        booklist = new ArrayList<>(); 
    }

    void createBooks(Book b)
    {
        booklist.add(b);
    }

    void AddingBooks()
    {
        System.out.println("Library Name : "+name+"---------------------->");
        for(Book b : booklist)
        {
            System.out.println("Book Title : "+b.getTitle()+"\nAuthor : "+b.getAuthor());
        }
    }

}
public class Program1 {
    public static void main(String[] args) {
        Book b1 = new Book("Pride and Prejudice", "Jane Austen");
        Book b2 = new Book("Harry Potter", "Jk Rowling");

        Library l1 = new Library("Chitkara");
        Library l2 = new Library("SunFlower");

        l1.createBooks(b1);
        l1.createBooks(b2);
        l2.createBooks(b1);

        l1.AddingBooks();
        l2.AddingBooks();

    }
    
}
