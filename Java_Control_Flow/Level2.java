package Java_Control_Flow;

import java.util.Scanner;

public class Level2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        // 1>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // if (number > 0) {

        //     for (int i = 1; i <= number; i++) 
        //     {
        //         if (i % 2 == 0) 
        //         {
        //             System.out.println(i + " is Even");
        //         } 
        //         else 
        //         {
        //             System.out.println(i + " is Odd");
        //         }
        //     }
        // } 
        // else 
        // {
        //     System.out.println("Invalid input. Please enter a natural number.");
        // }



        // 2>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int year = sc.nextInt();
        // double salary = sc.nextDouble();

        // if(year > 5)
        // {
        //     double bonus = salary * 5 / 100;
        //     System.out.println("Bonus : "+bonus);
        // }
        // else
        // {
        //     System.out.println("No Bonus");
        // }



        // 3>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // for (int i = 6; i <= 9; i++) 
        // {
        //     System.out.println(number + " * " + i + " = " + (number * i));
        // }



        // 4>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // if (number > 0) 
        // {
        //     for (int i = 1; i <= number; i++) 
        //     {
        //         if (i % 3 == 0 && i % 5 == 0) 
        //         {
        //             System.out.println("FizzBuzz");
        //         } 
        //         else if (i % 3 == 0) 
        //         {
        //             System.out.println("Fizz");
        //         } 
        //         else if (i % 5 == 0) 
        //         {
        //             System.out.println("Buzz");
        //         } 
        //         else 
        //         {
        //             System.out.println(i);
        //         }
        //     }
        // } else {
        //     System.out.println("Invalid input.");
        // }




        // 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // if (number > 0) 
        // {
        //     int i = 1;
        //     while(i <= number) 
        //     {
        //         if (i % 3 == 0 && i % 5 == 0) 
        //         {
        //             System.out.println("FizzBuzz");
        //         } 
        //         else if (i % 3 == 0) 
        //         {
        //             System.out.println("Fizz");
        //         } 
        //         else if (i % 5 == 0) 
        //         {
        //             System.out.println("Buzz");
        //         } 
        //         else 
        //         {
        //             System.out.println(i);
        //         }
        //         i++;
        //     }
        // } else {
        //     System.out.println("Invalid input.");
        // }





        // 6>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int amarAge = sc.nextInt();
        // int akbarAge = sc.nextInt();
        // int anthonyAge = sc.nextInt();

        // double amarHeight = sc.nextDouble();
        // double akbarHeight = sc.nextDouble();
        // double anthonyHeight = sc.nextDouble();

        
        // if (amarAge <= akbarAge && amarAge <= anthonyAge) {
        //     System.out.println("Amar is the youngest");
        // } 
        // else if (akbarAge <= anthonyAge) {
        //     System.out.println("Akbar is the youngest");
        // } 
        // else {
        //     System.out.println("Anthony is the youngest");
        // }

        // if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
        //     System.out.println("Amar is the tallest");
        // } 
        // else if (akbarHeight >= anthonyHeight) {
        //     System.out.println("Akbar is the tallest");
        // } 
        // else {
        //     System.out.println("Anthony is the tallest");
        // }




        // 7>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // if(number > 0)
        // {
        //     for(int i=1;i<number;i++)
        //     {
        //         if(number % i == 0)
        //         {
        //             System.out.println(i);
        //         }
        //     }
        // }




        // 8>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // if(number > 0)
        // {
        //     int i = 1;
        //     while(i<number)
        //     {
        //         if(number % i == 0)
        //         {
        //             System.out.println(i);
        //         }
        //         i++;
        //     }
        // }




        // 9>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // int greatestFactor = 1;

        // for (int i = number - 1; i >= 1; i--) 
        // {
        //     if (number % i == 0) 
        //     {
        //         greatestFactor = i;
        //         break;
        //     }
        // }

        // System.out.println("Greatest Factor = " + greatestFactor);





        // 10>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // int greatestFactor = 1;

        // int i = number - 1;
        // while(i >= 1) 
        // {
        //     if (number % i == 0) 
        //     {
        //         greatestFactor = i;
        //         break;
        //     }
        //     i--;
        // }

        // System.out.println("Greatest Factor = " + greatestFactor);




        // 11>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // int power = sc.nextInt();

        // int result = 1;

        // for (int i = 1; i <= power; i++) 
        // {
        //     result *= number;
        // }

        // System.out.println("Result = " + result);





        // 12>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // int power = sc.nextInt();

        // int result = 1;

        // int i = 1; 
        // while(i <= power) 
        // {
        //     result *= number;
        //     i++;
        // }

        // System.out.println("Result = " + result);





        // 13>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();

        // if (number > 0 && number < 100) {

        //     int counter = number - 1;

        //     while (counter > 1) {

        //         if (number % counter == 0) {
        //             System.out.println(counter);
        //         }

        //         counter--;
        //     }
        // } else {
        //     System.out.println("Invalid input");
        // }





        // 14>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // int power = sc.nextInt();

        // int result = 1;
        // int i = 0;

        // while (i < power) {
        //     result = result * number;
        //     i++;
        // }

        // System.out.println("Result = " + result);






        sc.close();



    }
    
}
