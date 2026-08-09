package Capgemini_Questions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int original = number;
        int count = 0;

        int temp = number;
        while (temp !=  0) 
        {
            count++;
            temp /=10;
        }

        int sum = 0;
        temp = number;
        while (temp != 0) 
        {
            int dig = temp % 10;
            sum += (int)Math.pow(dig, count);
            temp /= 10;
        }

        if(sum == original)
        {
            System.out.println("It is an Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
    
}
