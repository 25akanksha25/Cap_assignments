package Capgemini_Questions;
import java.util.HashSet;
import java.util.Scanner;


public class DuplicateElements {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            for(int j= i+1;j<n;j++)
            {
                if(arr[i] == arr[j] && !set.contains(arr[i]))
                {
                    System.out.print(arr[i] + " ");
                    set.add(arr[i]);
                    break;

                }
            }
        }
        

        

    }
    
}
