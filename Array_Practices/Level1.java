package Array_Practices;
import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);



        // 1>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int ages[] = new int[10];

        // System.err.println("Enter the age of the students:");
        // for(int i=0;i<ages.length;i++)
        // {
        //     ages[i] = sc.nextInt();
        // }
        // for(int i=0;i<ages.length;i++)
        // {
        //     if(ages[i]<0)
        //     {
        //         System.out.println("Invalid Age");
        //     }
        //     else if(ages[i]>=18)
        //     {
        //         System.out.println("The student with the age "+ages[i]+" can vote.");
        //     }
        //     else
        //     {
        //         System.out.println("The student with the age "+ages[i]+" cannot vote");
        //     }
        // }






        // 2>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int arr[] = new int[5];

        // System.out.println("Enter the 5 numbers:");
        // for(int i=0;i<arr.length;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }

        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]>0)
        //     {
        //         if(arr[i] % 2 == 0)
        //         {
        //             System.out.println(arr[i]+ " is an Even Number");
        //         }
        //         else
        //         {
        //             System.out.println(arr[i]+ " is an Odd Number");
        //         }
        //     }
        //     else if(arr[i] < 0)
        //     {
        //         System.out.println(arr[i]+ " is Negative Number");
        //     }
        //     else
        //     {
        //         System.out.println(arr[i]+ " is Zero");
        //     }
        // }

        // if(arr[0] == arr[arr.length - 1])
        // {
        //     System.out.println("First and Last elements are equal");
        // }
        // else if(arr[0] > arr[arr.length - 1])
        // {
        //     System.out.println("First element is greater than the last element.");
        // }
        // else
        // {
        //     System.out.println("Last element is greater than the first element.");
        // }






        // 3>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // int arr[] = new int[10];
        // if (number <= 0) 
        // {
        //     System.out.println("Invalid number.");
        //     System.exit(0);
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     arr[i] = number * (i+1);
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(number+ " * " +(i+1)+ " = "+arr[i]);
        // }






        // 4>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // double arr[] = new double[10];
        // double total = 0.0;
        // int index = 0;

        // while (true) {
        //     double number = sc.nextDouble();
        //     if(number <= 0)
        //     {
        //         break;
        //     }
        //     if(index == arr.length)
        //     {
        //         System.out.println("Maximum limit reached");
        //         break;
        //     }
        //     arr[index] = number;
        //     index++;
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     total += arr[i];
        // }
        // System.out.println("The total value is: "+total);





        // 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // int arr[] = new int[10];

        // int index = 0;
        // for(int i=6;i<=9;i++)
        // {
        //     arr[i] = number * i;
        //     index++;
        // }

        // for(int i=6;i<=9;i++)
        // {
        //     System.out.println(number+ " * " +i+ " = "+arr[i]);
        // }






        // 6>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // double heights[] = new double[11];
        // double total = 0.0;
        // for(int i=0;i<heights.length;i++)
        // {
        //     heights[i] = sc.nextDouble();
        //     total += heights[i];
        // }

        // double mean = total / 11;
        // System.out.println("Mean height of the football players : " +mean);





        // 7>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // if(number <= 0)
        // {
        //     System.out.println("Invalid number");
        //     System.exit(0);
        // }

        // int oddArr[] = new int[number/2 + 1];
        // int evenArr[] = new int[number/2 + 1];
        // int oddIndex = 0;
        // int evenIndex = 0;

        // for(int i=1;i<number;i++)
        // {
        //     if(i % 2 == 0)
        //     {
        //         evenArr[evenIndex] = i;
        //         evenIndex++;
        //     }
        //     else 
        //     {
        //         oddArr[oddIndex] = i;
        //         oddIndex++;
        //     }
        // }

        // System.out.println("Odd Numbers : ");
        // for(int i=0;i<oddIndex;i++)
        // {
        //     System.out.print(oddArr[i] + " ");
        // }

        // System.out.println("\nEven Numbers : ");
        // for(int i=0;i<evenIndex;i++)
        // {
        //     System.out.print(evenArr[i] + " ");
        // }





        
        //8>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // int maxFactor = 10;
        // int arr[] = new int[maxFactor];

        // int index = 0;

        // for(int i=1;i<=number;i++)
        // {
        //     if(number % i == 0)
        //     {
        //         if(index == maxFactor)
        //         {
        //             maxFactor = 2 * maxFactor;
        //             int temp [] = new int[maxFactor];

        //             for(int j=0;j<arr.length;j++)
        //             {
        //                 temp[j] = arr[j];
        //             }
        //             arr = temp;
        //         }
        //         arr[index] = i;
        //         index++;
        //     }
        // }
        // System.out.println("Factors of "+number+" are:");
        // for(int i=0;i<index;i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }







        // 9>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int rows = sc.nextInt();
        // int colums = sc.nextInt();
        // int Arr2D[][] = new int[rows][colums];
        // int Arr1D[] = new int[rows * colums];

        // int index = 0;
        // for(int i=0;i<rows;i++)
        // {
        //     for(int j=0;j<colums;j++)
        //     {
        //         Arr2D[i][j] = sc.nextInt();
        //         Arr1D[index] = Arr2D[i][j];
        //         index++;
        //     }
        // }

        // System.out.println("1D Array: ");
        // for(int i=0;i<index;i++)
        // {
        //     System.out.print(Arr1D[i] + " ");
        // }






        // 10>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // if(number <= 0)
        // {
        //     System.out.println("Invalid number");
        //     System.exit(0);
        // }

        // String arr[] = new String[number + 1];

        // for(int i=1;i<=number;i++)
        // {
        //     if(i % 3 == 0 && i % 5 == 0)
        //     {
        //         arr[i] = "FizzBuzz";
        //     }
        //     else if(i % 3 == 0)
        //     {
        //         arr[i] = "Fizz";
        //     }
        //     else if(i % 5 == 0)
        //     {
        //         arr[i] = "Buzz";
        //     }
        //     else
        //     {
        //         arr[i] = String.valueOf(i);
        //     }
        // }
        // for(int i=1;i<=number;i++)
        // {
        //     System.out.println("Position "+i+" : "+arr[i]);
        // }








        sc.close();

    }
    
}
