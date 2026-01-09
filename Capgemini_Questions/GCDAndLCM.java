package Capgemini_Questions;
import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int min = Math.min(number1,number2);
        int max = Math.max(number1, number2);

        int gcd = 1;
        for(int i=1;i<=min;i++)
        {
            if(number1%i == 0 && number2%i == 0)
            {
                gcd = i;
            }
        }

        int lcm = 0;
        for(int i = max;i<=number1 * number2;i++)
        {
            if(i % number1 == 0 && i % number2 == 0)
            {
                lcm = i;
            }
        }
        System.out.println("GCD of two numbers : "+gcd);
        System.out.println("LCM of two numbers : "+lcm);

    }
    
}
