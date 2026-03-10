package M1Practice.march8;

import java.util.*;

public class Ques15 {
    public static void main(String[] args) {
        int arr[] = {3,4,1,7,9};

        int even[] = new int[(arr.length / 2) + 1];
        int odd[] = new int[arr.length / 2];

        int eI = 0;
        int oI = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(i % 2 == 0)
            {
                even[eI++] = arr[i];
            }
            else
            {
                odd[oI++] = arr[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        int secEven = even[even.length - 2];
        int secOdd = odd[odd.length - 2];


        System.out.println(secEven + secOdd);
        
        
    }
    
}
