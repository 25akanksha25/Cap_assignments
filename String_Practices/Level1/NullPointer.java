package String_Practices.Level1;


public class NullPointer {

    public static void generateException()
    {
        System.out.println("Generating Exception");
        String text = null;
        System.out.println(text.length());
    }

    public static void nullPointerException()
    {
        System.out.println("Handling Exception");
        try
        {
            String text = null;
            System.out.println(text.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception Handled..... : " +e);
        }

        System.out.println("Program continues........");

    }
    public static void main(String[] args) {

        // generateException();
        nullPointerException();

    }
    
}
