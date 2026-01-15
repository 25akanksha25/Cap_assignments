package Class_Object_Assignment.Level2;

import java.util.Scanner;

public class PalindromeChecker {
    private String text;

    PalindromeChecker(String text)
    {
        this.text = text;
    }

    public boolean Palindrome()
    {
        int l = 0;
        int r = text.length() - 1;

        while (l < r) 
        {
            if (text.charAt(l) != text.charAt(r)) 
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public void displayResult()
    {
        if(Palindrome())
        {
            System.out.println(text+ " is a Palindrome");
        }
        else
        {
            System.out.println(text+ " is not a Palindrome");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        PalindromeChecker pc = new PalindromeChecker(text);
        pc.displayResult();
    }
    
}
