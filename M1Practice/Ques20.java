package M1Practice;

import java.util.*;

public class Ques20 {
    public static void main(String[] args) {
        String n = "1210";
        

        for(int i=0;i<n.length();i++)
        {
            int og = n.charAt(i) - '0';
            int count = 0;
            for(int j=0;j<n.length();j++)
            {
                if(n.charAt(j) - '0' == i)
                {
                    count++;
                }
            }
            if(count != og)
            {
                System.out.println(0);
                return;
            }
        }

        HashSet<Character> set = new HashSet<>();
        for(char c : n.toCharArray())
        {
            set.add(c);
        }
        System.out.println(set.size());
    }
    
}
