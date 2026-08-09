package String_Practices.Level1;

public class ArrayOutOfBounds {

    public static void generateException() 
    {
        System.out.println("Generating Exception");
        String[] names = {"A", "B", "C"};
        System.out.println(names[5]); 
    }

    public static void arrayIndexOutOfBoundsException() {
        System.out.println("Handling Exception");

        try 
        {
            String[] names = {"A", "B", "C"};
            System.out.println(names[5]); 
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Handled..... : " + e);
        }

        System.out.println("Program continues........");
    }

    public static void main(String[] args) {

        // generateException();
        arrayIndexOutOfBoundsException();

    }
}

