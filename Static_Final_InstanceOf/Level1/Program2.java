package Static_Final_InstanceOf.Level1;


class Book{
    private static String libraryName = "Sunshine Library";

    private String title;
    private String author;
    private final int isbn;

    Book(String title,String author,int isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName()
    {
        System.out.println("Library Name : "+libraryName);
    }

    public void displayDetails(Object obj)
    {
        if(obj instanceof Book)
        {
            System.out.println("Title : "+title+"\nAuthor : "+author+"\nISBN : "+isbn);
        }
    }
    

}
public class Program2 {
    public static void main(String[] args) {
        Book b = new Book("Jungle Book", "J K Rowling", 123456789);
        Book.displayLibraryName();
        b.displayDetails(b);
    }
    
}
