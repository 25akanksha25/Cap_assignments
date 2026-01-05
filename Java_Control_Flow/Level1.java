package Java_Control_Flow;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        // 1>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // if (number % 5 == 0) 
        // {
        //     System.out.println("Is the number " + number + " divisible by 5? Yes");
        // } 
        // else 
        // {
        //     System.out.println("Is the number " + number + " divisible by 5? No");
        // }



        // 2>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number1 = sc.nextInt();
        // int number2 = sc.nextInt();
        // int number3 = sc.nextInt();

        // if(number1 < number2 && number1 < number3)
        // {
        //     System.out.println("Is the first number the smallest ? Yes");
        // }
        // else
        // {
        //     System.out.println("Is the first number the smallest ? No");
        // }



        // 3>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number1 = sc.nextInt();
        // int number2 = sc.nextInt();
        // int number3 = sc.nextInt();

        // System.out.println("Is the first number the largest? " + (number1 >= number2 && number1 >= number3));
        // System.out.println("Is the second number the largest? " + (number2 >= number1 && number2 >= number3));
        // System.out.println("Is the third number the largest? " + (number3 >= number1 && number3 >= number2));



        // 4>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // if (number > 0) 
        // {
        //     int sum = number * (number + 1) / 2;
        //     System.out.println("The sum of " + number + " natural numbers is " + sum);
        // } 
        // else 
        // {
        //     System.out.println("The number " + number + " is not a natural number");
        // }


        // 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int age = sc.nextInt();
        // if(age >= 18)
        // {
        //     System.out.println("The person's is "+age+" and can vote.");
        // }
        // else
        // {
        //     System.out.println("The person's age is "+age+" and cannot vote.");
        // }


        // 6>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // if(number > 0)
        // {
        //     System.out.println("Positive");
        // }
        // else if(number < 0)
        // {
        //     System.out.println("Negative");
        // }
        // else
        // {
        //     System.out.println("Zero");
        // }



        // 7>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int day = sc.nextInt();
        // int month = sc.nextInt();

        // if ((month == 3 && day >= 20) ||
        //     (month > 3 && month < 6) ||
        //     (month == 6 && day <= 20)) {
        //     System.out.println("Its a Spring Season");
        // } else {
        //     System.out.println("Not a Spring Season");
        // }



        // 8>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int value = sc.nextInt();
        // while (value >= 1) {
        //     System.out.println(value);
        //     value--;
        // }




        // 9>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int value = sc.nextInt();
        // for(int i=value;i>=1;i--)
        // {
        //     System.out.println(i);
        // }



        // 10>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // double total = 0.0;
        // double value = sc.nextDouble();

        // while (value !=0) {
        //     total += value;
        //     value = sc.nextDouble();
            
        // }
        // System.out.println(total);




        // 11>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // double total = 0.0;

        // while (true) {
        //     double value = sc.nextDouble();
        //     if (value <= 0)
        //         break;
        //     total += value;
        // }
        // System.out.println("Total = " + total);



        // 12>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // if (number > 0)
        // {
        //     int sumWhile = 0, i = 1;
        //     while (i<=number) {
        //         sumWhile += i;
        //         i++;        
        //     }

        //     int sumFormula = number * (number + 1) / 2;
        //     System.out.println("While Sum = "+sumWhile);
        //     System.out.println("Formula Sum = "+sumFormula);

        // }



        // 13>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // if (number > 0)
        // {
        //     int sumFor = 0;
        //     for(int i=1;i<=number;i++) {
        //         sumFor += i;        
        //     }

        //     int sumFormula = number * (number + 1) / 2;
        //     System.out.println("For Sum = "+sumFor);
        //     System.out.println("Formula Sum = "+sumFormula);

        // }





        // 14>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // if(number > 0)
        // {
        //     long fact = 1;
        //     while (number > 0) {
        //         fact *= number;
        //         number--;
                
        //     }
        //     System.out.println("Factorial : "+fact);
        // }




        // 15>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // if(number > 0)
        // {
        //     long fact = 1;
        //     for(int i=number;i>0;i--) {
        //         fact *= i;
                
        //     }
        //     System.out.println("Factorial : "+fact);
        // }




        // 16>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
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



        // 17>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
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



        // 18>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        int number = sc.nextInt();
        for (int i = 6; i <= 9; i++) 
        {
            System.out.println(number + " * " + i + " = " + (number * i));
        }






        sc.close();

    }
    
}
