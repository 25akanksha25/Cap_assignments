package Questions;

import java.util.*;

public class CharachterCompression {
    public static void main(String[] args) {
        String str = "aaabbcddd";

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : str.toCharArray())
        {
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        for (Map.Entry<Character, Integer> en : map.entrySet()) 
        {
            System.out.print(en.getKey()+""+en.getValue());
            
        }
    }
}
