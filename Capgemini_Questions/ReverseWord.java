package Capgemini_Questions;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String res = "";
        for(String s : line.split(" "))
        {
            for(int i = s.length()-1;i>=0;i--)
            {
                res += s.charAt(i);
            }
            res += " ";
        }

        System.out.println("The Reverse Of words : "+res);
    }
    
}
