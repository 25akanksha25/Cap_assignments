package M1Practice.march10;

import java.util.*;

public class Ques8 {
    public static void main(String[] args) {
        int arr[] = {11,11,11,13,13,20};

        Set<Integer> set = new LinkedHashSet<>();

        for(int i : arr)
        {
            set.add(i);
        }

        int arr1[] = new int[set.size()];
        int idx = 0;
        for(int i : set)
        {
            arr1[idx++] = i;
        }

        for(int i : arr1)
        {
            System.out.print(i + " ");
        }

        
    }
    
}
