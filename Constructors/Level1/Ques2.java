package Constructors.Level1;

class Circle
{
    private double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    Circle()
    {
        radius = 0.0;
    }

    public void displayDetails()
    {
        System.out.println("Radius Of Circle : "+radius);
    }
}
public class Ques2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(10.9);
        Circle c2 = new Circle();
        System.out.println("Parameterized.........");
        c1.displayDetails();
        System.out.println("Default............");
        c2.displayDetails();
    }
    
}
