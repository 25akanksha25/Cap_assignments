package String_Practices.Level1;

import java.util.Scanner;

public class ReturnAllCharachters {

    public static char[] allCharacters(String s1)
    {
        char [] a = new char[s1.length()];

        for(int i=0;i<s1.length();i++)
        {
            a[i] = s1.charAt(i);
        }
        return a;
    }

    public static boolean compareCharacters(char [] a, char [] b)
    {
        if(a.length != b.length)
        {
            return false;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i] != b[i])
            {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();

        char [] userDefined = allCharacters(s1);
        char [] builtIn = s1.toCharArray();

        System.out.println("All Characters using user defined method : ");
        for(char c : userDefined)
        {
            System.out.print(c + " ");
        }

        System.out.println("\nAll Characters using Built-In method : ");
        for(char c : builtIn)
        {
            System.out.print(c + " ");
        }

        System.out.println("\nAre they equal : "+compareCharacters(userDefined,builtIn));

        sc.close();
    }
    
}
