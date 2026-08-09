package Capgemini_Questions;
import java.util.Scanner;


public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0)
        {
            System.out.println("Invalid");
        }

        int evenCount = 0;
        int oddCount = 0;

        while(num != 0 && num >0)
        {
            int dig = num % 10;
            if(dig % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            num /= 10;
        }

        System.out.println("Even Count is : "+evenCount);
        System.out.println("Odd Count is : "+oddCount);


    }
    
}
