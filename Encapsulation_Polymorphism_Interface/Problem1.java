package Encapsulation_Polymorphism_Interface;

interface Department
{
    void assignDepartment(String department);
    String getDepartmentDetails();
}

abstract class Employee
{
    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId,String name,double baseSalary)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
    public void displayDetails()
    {
        System.out.println("Employee Details : \nId: "+employeeId+"\nName : "+name+"\nBase Salary : "+baseSalary+"\nSalary: " + calculateSalary());
    }

    public double getBaseSalary() 
    {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) 
    {
        this.baseSalary = baseSalary;
    }

}

class FullTimeEmployee extends Employee implements Department
{
    private String department;

    FullTimeEmployee(int employeeId,String name,double baseSalary)
    {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary()
    {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String dep)
    {
        this.department = dep;
    }

    @Override
    public String getDepartmentDetails()
    {
        return department;
    }

}
class PartTimeEmployee extends Employee
{
    private int hours;
    private double rate;
    PartTimeEmployee(int employeeId,String name,int hours,double rate)
    {
        super(employeeId, name, 0);
        this.hours = hours;
        this.rate = rate;
    }

    public double calculateSalary()
    {
        return hours * rate;
    }
    
}
public class Problem1 {
    public static void main(String[] args) 
    {
        Employee e1 = new FullTimeEmployee(101, "Rahul", 50000);
        Employee e2 = new PartTimeEmployee(102, "Anita", 500,10);

        e1.displayDetails();
        e2.displayDetails();
        
    }
    
}
