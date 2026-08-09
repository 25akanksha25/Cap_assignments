package Array_Practices;
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        // 1>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int employees = 10;

        // double salary[] = new double[employees];
        // double yearsOfService[] = new double[employees];
        // double newSalary[] = new double[employees];
        // double bonus[] = new double[employees];

        // double totalBonus = 0.0;
        // double totalOldSalary = 0.0;
        // double totalNewSalary = 0.0;


        // for(int i=0;i<employees;i++)
        // {
        //     System.out.println("Salary of employee "+(i+1));
        //     salary[i] = sc.nextDouble();
        //     System.out.println("Years of service for "+(i+1)+ " employee");
        //     yearsOfService[i] = sc.nextDouble();

        //     if (salary[i] <= 0 || yearsOfService[i] < 0) 
        //     {
        //         System.out.println("Invalid input. Enter again.");
        //         i--;
        //         continue;
        //     }
        // }

        // for(int i=0;i<employees;i++)
        // {
        //     if(yearsOfService[i] > 5)
        //     {
        //         bonus[i] = salary[i] * 0.05;
        //     }
        //     else
        //     {
        //         bonus[i] = salary[i] * 0.02;
        //     }

        //     newSalary[i] = salary[i] + bonus[i];

        //     totalBonus += bonus[i];
        //     totalOldSalary += salary[i];
        //     totalNewSalary += newSalary[i];
        // }

        // System.out.println("Total Bonus Amount : "+totalBonus);
        // System.out.println("Total Old Salary: "+totalOldSalary);
        // System.out.println("Total New Salary : "+totalNewSalary);







        // 2>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int age[] = new int[3];
        // double height[] = new double[3];

        // String[] names = {"Amar", "Akbar", "Anthony"};

        // for (int i = 0; i < names.length; i++) 
        // {
        //     System.out.print("Enter age of " +names[i]);
        //     age[i] = sc.nextInt();

        //     System.out.print("Enter height of " +names[i]);
        //     height[i] = sc.nextDouble();
        // }

        // int youngestIndex = 0;
        // int tallestIndex = 0;

        // for (int i = 1; i < names.length; i++) 
        // {
        //     if (age[i] < age[youngestIndex]) 
        //     {
        //         youngestIndex = i;
        //     }
        //     if (height[i] > height[tallestIndex]) 
        //     {
        //         tallestIndex = i;
        //     }
        // }

        // System.out.println("Youngest: " + names[youngestIndex]);
        // System.out.println("Tallest: " + names[tallestIndex]);





        // 3>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // int maxDigit = 10;
        // int arr[] = new int[maxDigit];

        // int index = 0;

        // while (number != 0 && index < maxDigit) {
        //     arr[index] = number % 10;
        //     index++;
        //     number = number / 10;
        // }

        // int largest = 0;
        // int secondLargest = 0;

        // for(int i=0;i<index;i++)
        // {
        //     if(arr[i] > largest)
        //     {
        //         secondLargest = largest;
        //         largest = arr[i];
        //     }
        //     else if(arr[i] > secondLargest && arr[i] != largest)
        //     {
        //         secondLargest = arr[i];
        //     }
        // }

        // System.out.println("Largest number is : "+largest);
        // System.out.println("Second Largest number is : "+secondLargest);







        // 4>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // int maxDigit = 10;
        // int arr[] = new int[maxDigit];

        // int index = 0;

        // while (number != 0) {

        //     if(index == maxDigit)
        //     {
        //         maxDigit += 10;
        //         int [] temp = new int[maxDigit];

        //         for(int i=0;i<arr.length;i++)
        //         {
        //             temp[i] = arr[i];
        //         }
        //         arr = temp;
        //     }

        //     arr[index] = number % 10;
        //     index++;
        //     number = number / 10;
        // }

        // int largest = 0;
        // int secondLargest = 0;

        // for(int i=0;i<index;i++)
        // {
        //     if(arr[i] > largest)
        //     {
        //         secondLargest = largest;
        //         largest = arr[i];
        //     }
        //     else if(arr[i] > secondLargest && arr[i] != largest)
        //     {
        //         secondLargest = arr[i];
        //     }
        // }

        // System.out.println("Largest number is : "+largest);
        // System.out.println("Second Largest number is : "+secondLargest);










        sc.close();
        
    }
    
}
