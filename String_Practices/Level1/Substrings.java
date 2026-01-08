package String_Practices.Level1;

import java.util.Scanner;

public class Substrings {
    public static String substringOfString(String s1, int start , int end)
    {
        String sub = "";
        for(int i=start;i<end;i++)
        {
            sub += s1.charAt(i);
        }
        return sub;
    }

    public static boolean comparisonOfSubstrings(String s1, String s2)
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
        String s1 = sc.next();
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();

        String customSubString = substringOfString(s1, startIndex, endIndex);
        String builtSubstring = s1.substring(startIndex,endIndex);

        System.out.println("Substring with charAt method : "+customSubString);
        System.out.println("Substring with Built-In method : "+builtSubstring);

        System.out.println("Are they equal: "+comparisonOfSubstrings(customSubString,builtSubstring));


        sc.close();
    }
    
}
