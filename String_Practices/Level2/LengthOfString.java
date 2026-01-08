package String_Practices.Level2;
import java.util.Scanner;


public class LengthOfString {
    public static int lengthOfTheString(String text)
    {
        int count = 0;
        try
        {
            while(true)
            {
                text.charAt(count);
                count++;
            }
        }
        catch(RuntimeException e)
        {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int length = lengthOfTheString(text);

        System.out.println("The length of String without length method : "+length);
        System.out.println("The length with Built-In method : "+(text.length()));

    }
    
}
