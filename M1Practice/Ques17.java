package M1Practice;

import java.util.*;

public class Ques17 {
    public static boolean palindrome(int n)
    {
        int temp = n;
        int rev = 0;
        while(temp != 0)
        {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp /= 10;
        }

        if(rev == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int lower = 10;
        int upper = 80;

        List<Integer> list = new ArrayList<>();
        for(int i=lower;i<upper;i++)
        {
            if(palindrome(i))
            {
                list.add(i);
            }
        }

        System.out.println(list);
    }
    
}
