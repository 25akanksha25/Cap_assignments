package Method_Practices;
import java.util.Scanner;

public class Level2 {


    // 1>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static int[] findFactors(int number)
    // {
    //     int count = 0;
    //     for(int i=1;i<=number;i++)
    //     {
    //         if(number % i == 0)
    //         {
    //             count++;
    //         }
    //     }

    //     int factors [] = new int[count];
    //     int index = 0;
    //     for(int i=1;i<=number;i++)
    //     {
    //         if(number % i == 0)
    //         {
    //             factors[index] = i;
    //             index++;
    //         }
    //     }

    //     return factors;
    // }

    // public static int sumOfFactors(int []factors)
    // {
    //     int sum = 0;
    //     for(int i : factors)
    //     {
    //         sum += i;
    //     }
    //     return sum;
    // }

    // public static int productOfFactors(int []factors)
    // {
    //     int prod = 1;
    //     for(int i : factors)
    //     {
    //         prod *= i;
    //     }
    //     return prod;
    // }

    // public static double sumOfSquares(int []factors)
    // {
    //     double sum = 0;
    //     for(int i : factors)
    //     {
    //         sum += Math.pow(i,2);
    //     }
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int number = sc.nextInt();

    //     int[] factors = findFactors(number);

    //     System.out.println("Factors:");
    //     for(int fact : factors)
    //     {
    //         System.out.print(fact + " ");
    //     }

    //     System.out.println("\nSum: " + sumOfFactors(factors));
    //     System.out.println("Sum of Squares: " + sumOfSquares(factors));
    //     System.out.println("Product: " + productOfFactors(factors));

    // }








    // 3>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static boolean isLeapYear(int year) 
    // {
    //     if (year < 1582) {
    //         return false;
    //     }

    //     return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    // }

    // public static void main(String[] args) 
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int year = sc.nextInt();

    //     if (isLeapYear(year)) {
    //         System.out.println("Leap Year");
    //     } else {
    //         System.out.println("Not a Leap Year");
    //     }
    // }






    // 4>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static boolean canStudentVote(int age) 
    // {
    //     if (age < 0) {
    //         return false;
    //     }
    //     return age >= 18;
    // }

    // public static void main(String[] args) 
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int[] ages = new int[10];

    //     for (int i = 0; i < ages.length; i++) 
    //     {
    //         ages[i] = sc.nextInt();
    //         System.out.println(canStudentVote(ages[i]) ? "Can Vote" : "Cannot Vote");
    //     }
    // }







    // 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static int findYoungest(int[] ages) 
    // {
    //     int youngest = ages[0];
    //     for (int age : ages) 
    //     {
    //         if (age < youngest) 
    //         {
    //             youngest = age;
    //         }
    //     }
    //     return youngest;
    // }

    // public static double findTallest(double[] heights) 
    // {
    //     double tallest = heights[0];
    //     for (double height : heights) 
    //     {
    //         if (height > tallest) 
    //         {
    //             tallest = height;
    //         }
    //     }
    //     return tallest;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int[] ages = new int[3];
    //     double[] heights = new double[3];

    //     for (int i = 0; i < 3; i++) 
    //     {
    //         ages[i] = sc.nextInt();
    //         heights[i] = sc.nextDouble();
    //     }

    //     System.out.println("Youngest Age: " + findYoungest(ages));
    //     System.out.println("Tallest Height: " + findTallest(heights));
    // }

    




    // 6>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static boolean isPositive(int number) 
    // {
    //     return number >= 0;
    // }

    // public static boolean isEven(int number) 
    // {
    //     return number % 2 == 0;
    // }

    // public static int compare(int a, int b) 
    // {
    //     if (a > b) 
    //     {
    //         return 1;
    //     }
    //     if (a < b) 
    //     {
    //         return -1;
    //     }
    //     return 0;
    // }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     int[] numbers = new int[5];

    //     for (int i = 0; i < numbers.length; i++) {
    //         numbers[i] = scanner.nextInt();
        
    //         if (isPositive(numbers[i])) 
    //         {
    //             if (isEven(numbers[i])) 
    //             {
    //                 System.out.println("Positive Even");
    //             } 
    //             else 
    //             {
    //                 System.out.println("Positive Odd");
    //             }
    //         } 
    //         else 
    //         {
    //             System.out.println("Negative Number");
    //         }
    //     }
        
    //     int result = compare(numbers[0], numbers[4]);
        
    //     if (result == 0) 
    //     {
    //         System.out.println("First and Last are Equal");
    //     } 
    //     else if (result > 0) 
    //     {
    //         System.out.println("First is Greater");
    //     } 
    //     else 
    //     {
    //         System.out.println("First is Smaller");
    //     }
    // }



    
}
