package String_Practices.Level1;


public class NumberException {

    public static void generateException() 
    {
        System.out.println("Generating Exception");
        String text = "abc";  
        int number = Integer.parseInt(text);
        System.out.println(number);
    }

    public static void FormatException() 
    {
        System.out.println("Handling Exception");

        try {
            String text = "abc";   
            int number = Integer.parseInt(text);
            System.out.println(number);
        }
        catch(NumberFormatException e) 
        {
            System.out.println("Exception Handled..... : " + e);
        }

        System.out.println("Program continues........");
    }

    public static void main(String[] args) {

        // generateException();
        FormatException();

    }
}
