package Capgemini_Questions;
import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 0, b=1;
        for(int i=0;i<=num;i++)
        {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
    
}
