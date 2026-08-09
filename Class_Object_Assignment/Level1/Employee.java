package Class_Object_Assignment.Level1;

import java.util.Scanner;

public class Employee {
    private String name;
    private  int id;
    private int salary;

    Employee(String name, int id, int salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }



    public void displayDetails()
    {
        System.out.println("Employee name: "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Employee salary : "+salary);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        int salary = sc.nextInt();

        Employee e = new Employee(name,id,salary);
        e.displayDetails();
    }
    
}

