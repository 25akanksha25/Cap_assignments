package Complexity;
import java.util.*;

public class Program1 {

    public static int LinearSearch(int arr[],int t)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == t)
            {
                return i;
            }
        }

        return -1;

    }

    public static int BinarySearch(int arr[],int t)
    {
        int l = 0;
        int r = arr.length - 1;

        
        while(l <= r)
        {
            int mid = l + (r - l) / 2;

            if(t == arr[mid])
            {
                return mid;
            }
            else if(arr[mid] < t)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = i;
        }

        int t = n - 1;

        long linearTime = System.nanoTime();
        LinearSearch(arr, t);
        linearTime = System.nanoTime() - linearTime;

        long binaryTime = System.nanoTime();
        BinarySearch(arr, t);
        binaryTime = System.nanoTime() - binaryTime;

        System.out.println("Linear time: " + linearTime);
        System.out.println("Binary time: " + binaryTime);





    }
    
}
