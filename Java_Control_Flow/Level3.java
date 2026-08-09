package Java_Control_Flow;

import java.util.Scanner;

public class Level3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int year = sc.nextInt();

        // if (year >= 1582) {
        //     if (year % 400 == 0) {
        //         System.out.println("Leap Year");
        //     } else if (year % 100 == 0) {
        //         System.out.println("Not a Leap Year");
        //     } else if (year % 4 == 0) {
        //         System.out.println("Leap Year");
        //     } else {
        //         System.out.println("Not a Leap Year");
        //     }
        // } else {
        //     System.out.println("Invalid Year");
        // }


        // 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int year = sc.nextInt();

        // if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
        //     System.out.println("Leap Year");
        // } else {
        //     System.out.println("Not a Leap Year");
        // }


        // 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int physics = sc.nextInt();
        // int chemistry = sc.nextInt();
        // int maths = sc.nextInt();

        // double average = (physics + chemistry + maths) / 3.0;

        // System.out.println("Average = " + average);

        // if (average >= 90) {
        //     System.out.println("Grade A - Excellent");
        // } else if (average >= 75) {
        //     System.out.println("Grade B - Very Good");
        // } else if (average >= 60) {
        //     System.out.println("Grade C - Good");
        // } else if (average >= 40) {
        //     System.out.println("Grade D - Pass");
        // } else {
        //     System.out.println("Grade F - Fail");
        // }


        // 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // boolean isPrime = true;

        // if (number <= 1) {
        //     isPrime = false;
        // } else {
        //     for (int i = 2; i < number; i++) {
        //         if (number % i == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        // }
        // if (isPrime) {
        //     System.out.println("Prime Number");
        // } else {
        //     System.out.println("Not a Prime Number");
        // }


        // 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // int originalNumber = number;
        // int sum = 0;

        // while (originalNumber != 0) {
        //     int digit = originalNumber % 10;
        //     sum += digit * digit * digit;
        //     originalNumber = originalNumber / 10;
        // }

        // if (sum == number) {
        //     System.out.println("Armstrong Number");
        // } else {
        //     System.out.println("Not an Armstrong Number");
        // }


        // 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // int count = 0;
        // while (number != 0) {
        //     number = number / 10;
        //     count++;
        // }

        // System.out.println("Digits = " + count);


        // 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // double weight = sc.nextDouble();
        // double heightCm = sc.nextDouble();
        // double heightM = heightCm / 100;
        // double bmi = weight / (heightM * heightM);

        // System.out.println("BMI = " + bmi);

        // if (bmi < 18.5) {
        //     System.out.println("Underweight");
        // } else if (bmi < 25) {
        //     System.out.println("Normal");
        // } else if (bmi < 40) {
        //     System.out.println("Overweight");
        // } else {
        //     System.out.println("Obese");
        // }


        // 8 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // int temp = number;
        // int sum = 0;

        // while (temp != 0) {
        //     sum += temp % 10;
        //     temp = temp / 10;
        // }
        // if (number % sum == 0) {
        //     System.out.println("Harshad Number");
        // } else {
        //     System.out.println("Not a Harshad Number");
        // }


        // 9 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // int number = sc.nextInt();
        // int sum = 0;

        // for (int i = 1; i < number; i++) {
        //     if (number % i == 0) {
        //         sum += i;
        //     }
        // }

        // if (sum > number) {
        //     System.out.println("Abundant Number");
        // } else {
        //     System.out.println("Not an Abundant Number");
        // }


        // 10 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // double first = sc.nextDouble();
        // double second = sc.nextDouble();
        // String op = sc.next();

        // switch (op) {
        //     case "+":
        //         System.out.println(first + second);
        //         break;
        //     case "-":
        //         System.out.println(first - second);
        //         break;
        //     case "*":
        //         System.out.println(first * second);
        //         break;
        //     case "/":
        //         System.out.println(first / second);
        //         break;
        //     default:
        //         System.out.println("Invalid Operator");
        // }


       

        sc.close();
    }
}
