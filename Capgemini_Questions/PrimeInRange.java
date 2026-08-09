package Capgemini_Questions;
import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();


        for(int i=start;i<=end;i++)
        {
            boolean isPrime = true;
            if(i <= 1)
            {
                isPrime = false;
            }
            for(int j=2;j<i;j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            {
                System.out.print(i + " ");
            }
        }
    }
    
}
