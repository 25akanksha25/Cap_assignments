package String_Practices.Level1;
import java.util.Scanner;


public class IllegalArgument {
    public static void generateException(String text)
    {
        System.out.println("Generating Exception....");
        String s = text.substring(2,0);
        System.out.println(s);
    }

    public static void illegalArgumentException(String text)
    {
        System.out.println("Handling Exception ....");
        try
        {
            String s = text.substring(2,0);
            System.out.println(s);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Exception Handled.... " +e);
        }
        catch (RuntimeException e) {
            System.out.println("Runtime Exception handled");
        }

        System.out.println("Program continues.......");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        // generateException(text);
        illegalArgumentException(text);

        sc.close();
    }
    
}
