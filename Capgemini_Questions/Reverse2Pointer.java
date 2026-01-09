package Capgemini_Questions;
import java.util.Scanner;


public class Reverse2Pointer {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        for(int i=0;i<n/2;i++)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed Array");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i] + " ");
        }

    }
    
}
