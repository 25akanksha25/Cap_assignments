package Questions;

import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        Set<Character> set = new HashSet<>();

        int l=0,r=0,maxlen=0;

        while(r<str.length())
        {
            if(!set.contains(str.charAt(r)))
            {
                set.add(str.charAt(r));
                r++;
                maxlen = Math.max(maxlen,r-l);
            }
            else
            {
                set.remove(str.charAt(l));
                l++;
            }
        }

        System.out.println(maxlen);

        
    }
    
}
