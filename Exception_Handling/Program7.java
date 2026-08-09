package Exception_Handling;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("first number: ");
            int x = sc.nextInt();

            System.out.print("second number: ");
            int y = sc.nextInt();

            int result = x / y;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");

        } finally {
            System.out.println("Completed");
            sc.close();
        }
    }
    
}
