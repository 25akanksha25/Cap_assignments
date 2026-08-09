package Capgemini_Questions;
import java.util.Scanner;


public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] a = new int[row][col];

        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix : ");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nTranspose Matrix : ");
        for (int j = 0; j < col; j++) 
        {
            for (int i = 0; i < row; i++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
