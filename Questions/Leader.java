package Questions;
import java.util.*;

public class Leader {
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

        int max = arr[n-1];

        list.add(arr[n-1]);

        for(int i=n-2;i>=0;i--)
        {
            if(arr[i] > max)
            {
                list.add(arr[i]);
                max = arr[i];
            }
        }

        System.out.println("Leaders : "+list);

        

        
    }
    
}
