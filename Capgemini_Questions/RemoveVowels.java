package Capgemini_Questions;
import java.util.Scanner;


public class RemoveVowels {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = "";

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'))
            {
                res += c;
            }
        }
        System.out.println("String without vowels : "+res);
    }
    
}
