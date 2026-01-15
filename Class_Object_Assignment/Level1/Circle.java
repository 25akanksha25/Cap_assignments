package Class_Object_Assignment.Level1;

import java.util.Scanner;

public class Circle {
    private double radius;

    Circle(double r)
    {
        radius = r;
    }

    public double area(double radius)
    {
        return Math.PI * radius * radius;
    }

    public double circumference(double radius)
    {
        return 2 * Math.PI * radius;
    }

    public void displayResult()
    {
        System.out.println("Area of circle : "+area(radius));
        System.out.println("Circumference of circle : "+circumference(radius));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);
        c.displayResult();
    }
    
}
