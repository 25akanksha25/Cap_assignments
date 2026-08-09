package StringsAndSearchAlgos.LinearSearch;

import java.util.Scanner;

public class Program1 {

    public static int negativeFind(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < 0)
            {
                return i;
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
            arr[i] = sc.nextInt();
        }

        int indx = negativeFind(arr);
        System.out.println("Negative found at : "+indx);
        
        
    }
    
}
