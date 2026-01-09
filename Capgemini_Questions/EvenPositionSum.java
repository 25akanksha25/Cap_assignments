package Capgemini_Questions;
import java.util.Scanner;


public class EvenPositionSum {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int position = 1;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            if (position % 2 == 0) {
                sum += digit;
            }

            number /= 10;
            position++;
        }

        System.out.println("Even digits sum : "+sum);
    }
    
}