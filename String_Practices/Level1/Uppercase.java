package String_Practices.Level1;

import java.util.Scanner;

public class Uppercase {
    public static String charUppercase(String text)
    {
        String res = "";
        
        for(int i=0;i<text.length();i++)
        {
            char c = text.charAt(i);
            if(c >= 'a' && c <= 'z')
            {
                c = (char)(c-32);
            }
            res += c;
        }     
        
        return res;
    }

    public static boolean comparingStrings(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String userDefined = charUppercase(text);
        String builtIn = text.toUpperCase();

        System.out.println("The Uppercase text from user defined method : "+userDefined);
        System.out.println("The Uppercase text from Built-In method : "+builtIn);

        System.out.println("Are they equal after comparing : "+comparingStrings(userDefined,builtIn));




        sc.close();
    }
    
}
