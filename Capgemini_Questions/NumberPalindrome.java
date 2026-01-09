package Capgemini_Questions;
import java.util.Scanner;


public class NumberPalindrome {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
    int number = sc.nextInt();
    int rev = 0;
    int temp = number;

    while(temp > 0)
    {
        rev = rev * 10 + temp % 10;
        temp /= 10;
    }

    if(number == rev)
    {
        System.out.println("The Number "+number+" is a palindrome");
    }
    else
    {
        System.out.println("The Number "+number+" is not a palindrome");
    }



    }

}
