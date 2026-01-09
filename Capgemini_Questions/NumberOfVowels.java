package Capgemini_Questions;
import java.util.Scanner;

public class NumberOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        String str = sc.nextLine();
        int count = 0;

        str = str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            {
                count++;
            }
        }

        System.out.println("Number Of Vowels : "+count);

    }
    
}
