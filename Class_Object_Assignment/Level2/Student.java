package Class_Object_Assignment.Level2;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNumber;
    private int marks;

    Student(String name, int rollNumber,int marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char calculateGrade(int marks)
    {
        if(marks >= 90 && marks<100)
        {
            return 'A';
        }
        else if(marks >=75 && marks <90)
        {
            return 'B';
        }
        else if(marks >=55 && marks <75)
        {
            return 'C';
        }
        else if(marks >= 40 && marks < 55)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
        
    }

    public void StudentDetails()
    {
        System.out.println("Student Details : ");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Marks : "+marks);
        System.out.println("Grade : "+calculateGrade(marks));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int rollNumber = sc.nextInt();
        int marks = sc.nextInt();

        Student s = new Student(name, rollNumber, marks);
        s.calculateGrade(marks);
        s.StudentDetails();

    }
    
}
