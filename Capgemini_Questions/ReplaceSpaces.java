package Capgemini_Questions;
import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = "";
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c == ' ')
            {
                result += "-";
            }
            else
            {
                result += c;
            }
        }

        System.out.println("After Replacing : "+result);
    }
    
}
