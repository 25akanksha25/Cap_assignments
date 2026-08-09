package Method_Practices;

import java.util.Scanner;

public class Level1 {


    // 1>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static int calculateSimpleInterest(int principal, int rate, int time)
    // {
    //     return (principal * rate * time) / 100;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int principal = sc.nextInt();
    //     int rate = sc.nextInt();
    //     int time = sc.nextInt();

    //     int simpleInterest = calculateSimpleInterest(principal,rate,time);

    //     System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+" ,Rate of Interest "+rate+" and Time "+time);
      
    // }








    // 2>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // public int maxHandshakes(int number)
    // {
    //     return (number * (number - 1)) / 2;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int number = sc.nextInt();

    //     Level1 obj = new Level1();
    //     int hanshake = obj.maxHandshakes(number);

    //     System.out.println("The total Number of handshakes for "+number+" of students : "+hanshake);
    // }








    // 3>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public int maxHandshakes(int number)
    // {
    //     return (number * (number - 1)) / 2;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int numberOfStudents = sc.nextInt();

    //     Level1 obj = new Level1();
    //     int hanshake = obj.maxHandshakes(numberOfStudents);

    //     System.out.println("The total Number of handshakes for "+numberOfStudents+" of students : "+hanshake);
    // }







    // 4>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static double totalRounds(double firstSide, double secondSide, double thirdSide)
    // {
    //     double perimeter = firstSide + secondSide + thirdSide;
    //     double totalDistance = 5000;

    //     double rounds = totalDistance / perimeter;

    //     return rounds;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     double firstSide = sc.nextDouble();
    //     double secondSide = sc.nextDouble();
    //     double thirdSide = sc.nextDouble();

    //     double rounds = totalRounds(firstSide,secondSide,thirdSide);

    //     System.out.println("The total Number of rounds needed to complete 5Km are : "+rounds);

    // }
    




    // 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static int checkNumber(int number) 
    // {
    //     if(number > 0)
    //     {
    //         return 1;
    //     }
    //     else if(number < 0)
    //     {
    //         return -1;
    //     }
    //     return 0;
        
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int number = sc.nextInt();

    //     int result = checkNumber(number);
    //     System.out.println(result);
    // }






    // 6>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static boolean SpringSeason(int month, int day)
    // {
    //     if((month == 3 && day >= 20) || (month > 3 && month <6) || (month == 6 && day <= 20))
    //     {
    //         return true;
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int month = sc.nextInt();
    //     int day = sc.nextInt();

    //     if(SpringSeason(month,day))
    //     {
    //         System.out.println("Its is a Spring Season");
    //     }
    //     else
    //     {
    //         System.out.println("Not a Spring Season");
    //     }
        
    // }







    // 7>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static int sumOfNaturalNumbers(int number)
    // {
    //     int sum = 0;
            // for (int i = 1; i <= number; i++) {
            //     sum += i;
            // }
            // return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int number = sc.nextInt();
    //     int sum = sumOfNaturalNumbers(number);
    //     System.out.println("Sum of "+number+" natural numbers : "+sum);
    // }





    // 8>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static int[] findSmallestAndLargest(int num1, int num2, int num3)
    // {
    //     int largest = num1;
    //     int smallest = num1;

    //     if(num2 > largest)
    //     {
    //         largest = num2;
    //     }
    //     else if(num2 < smallest)
    //     {
    //         smallest = num2;
    //     }

    //     if(num3 > largest)
    //     {
    //         largest = num3;
    //     }
    //     else if(num3 < smallest)
    //     {
    //         smallest = num3;
    //     }

    //     return new int[]{smallest,largest};
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int number1 = sc.nextInt();
    //     int number2 = sc.nextInt();
    //     int number3 = sc.nextInt();

    //     int [] result = findSmallestAndLargest(number1,number2,number3);

    //     System.out.println("Smallest : "+result[0]);
    //     System.out.println("Largest : "+result[1]);

    // }







    // 9>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static int[] findRemainderAndQuotients(int number, int divisor)
    // {
    //     int quotient = number / divisor;
    //     int remainder = number % divisor;

    //     return new int[]{quotient,remainder};
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int number = sc.nextInt();
    //     int divisor = sc.nextInt();

    //     int[] result = findRemainderAndQuotients(number,divisor);
    //     System.out.println("Quotient : "+result[0]);
    //     System.out.println("Remainder : "+result[1]);
    // }








    // 10>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static int[] findRemainderAndQuotients(int N, int M)
    // {
    //     int chocolateEach = N / M;
    //     int remaining = N % M;

    //     return new int[]{chocolateEach,remaining};
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int numberOfChocolates = sc.nextInt();
    //     int numberOfChildren = sc.nextInt();

    //     int result[] = findRemainderAndQuotients(numberOfChocolates,numberOfChildren);
    //     System.out.println("Number of Chocolates each child gets : "+result[0]);
    //     System.out.println("Remaining Chocolates : "+result[1]);
    // }







    // 11>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static double calculateWindChill(double temp, double windSpeed)
    // {
    //     double windChill = 35.74 + 0.6215 * temp +(0.4275 * temp - 35.75) * Math.pow(windSpeed,0.16);
    //     return windChill;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     double temperature = sc.nextDouble();
    //     double windSpeed = sc.nextDouble();

    //     double windChill = calculateWindChill(temperature,windSpeed);

    //     System.out.println("Wind Chill : "+windChill);
    // }






    // 12>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static double[] calculateTrigonometricFunctions(double angle) 
    {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angle = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

    }




}
