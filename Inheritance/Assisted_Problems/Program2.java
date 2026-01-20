package Inheritance.Assisted_Problems;

class Employee
{
    String name;
    int id;
    int salary;

    Employee(String name,int id,int salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails()
    {
        System.out.println("Name : "+name+"\nID : "+id+"\nSalary : "+salary);
    }
}
class Manager extends Employee
{
    int teamSize;
    Manager(String name,int id,int salary,int teamSize)
    {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    void displayDetails()
    {
        System.out.println("Manager : \nTeam Size : "+teamSize);
        super.displayDetails();
    }
}

class Developer extends Employee
{
    String programmingLanguage;
    Developer(String name,int id,int salary,String programmingLanguage)
    {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    void displayDetails()
    {
        System.out.println("Developer : \nProgramming Langauge : "+programmingLanguage);
        super.displayDetails();
    }
}

class Intern extends Employee
{
    Intern(String name,int id,int salary)
    {
        super(name, id, salary);
    }
    void displayDetails()
    {
        System.out.println("Intern");
        super.displayDetails();
    }
}
public class Program2 {
    public static void main(String[] args) {
        Employee e1 = new Manager("Shyam",1220,58000,5);
        Employee e2 = new Developer("Adi",1258,80000,"Java");
        Employee e3 = new Intern("Ram",1212,40000);
        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();
        e3.displayDetails();



    }
    
}

