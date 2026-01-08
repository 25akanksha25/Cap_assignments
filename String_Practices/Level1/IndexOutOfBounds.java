package String_Practices.Level1;
import java.util.Scanner;


public class IndexOutOfBounds {
    public static void generateException(String text)
    {
        System.out.println("Generating Exception.....");
        char ch = text.charAt(text.length());
        System.out.println(ch);
    }

    public static void stringOutOfBounds(String text)
    {
        System.out.println("Hnadling Exception ..... ");
        try 
        {
            char ch = text.charAt(text.length());
            System.out.println(ch);
            
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled .... " +e);
        }

        System.out.println("Program continues........");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generateException(text);
        stringOutOfBounds(text);

    }
    
}
