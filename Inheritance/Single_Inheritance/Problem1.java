package Inheritance.Single_Inheritance;

class Book
{
    String title;
    int publicationYear;

    Book(String title, int publicationYear)
    {
        this.title = title;
        this.publicationYear = publicationYear;
    }  

}

class Author extends Book
{
    String name;
    String bio;

    Author(String title, int publicationYear ,String name,String bio)
    {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayDetails()
    {
        System.out.println("Title : "+title+"\nPublication Year : "+publicationYear+"\nName : "+name+"\nBio : "+bio);
    }


}
public class Problem1 {
    public static void main(String[] args) {
        Author b = new Author("Jungle Book", 2026, "Ana", "Hello Everyone");
        b.displayDetails();
    }
    
}
