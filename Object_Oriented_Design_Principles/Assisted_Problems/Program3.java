package Object_Oriented_Design_Principles.Assisted_Problems;
import java.util.*;

class Employee
{
    private String name;
    private int id;
    private double salary;

    Employee(String name,int id,double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void getDetails()
    {
        System.out.println("Name : "+name+", ID : "+id+", Salary : "+salary);
    }
}

class Department
{
    private String departmentName;
    List<Employee> empList;
    Employee e;

    Department(String departmentName)
    {
        this.departmentName = departmentName;
        empList = new ArrayList<>();
    }

    void addEmployee(String name,int id,double salary)
    {
        Employee e = new Employee(name, id, salary);
        empList.add(e);
    }

    public void getDepartmentDetails()
    {
        System.out.println("Department Name :  "+departmentName+"\nEmployees :---> ");
        for(Employee e : empList)
        {
            e.getDetails();
        }

    }

}

class Company
{
    private String name;
    List<Department> deptList;
    Department d;

    Company(String name)
    {
        this.name = name;
        deptList = new ArrayList<>();
    }

    Department addDepartment(String name)
    {
        Department d = new Department(name);
        deptList.add(d);
        return d;
    }

    public void getCompanyDetails()
    {
        System.out.println("Company Details :-----> Company Name :  "+name);
        for(Department e : deptList)
        {
            e.getDepartmentDetails();;
        }

    }


}
public class Program3 {
    public static void main(String[] args) {
        Company c1 = new Company("Capgemini");

        Department it = c1.addDepartment("IT");
        Department sales = c1.addDepartment("Sales");

        it.addEmployee("Ram",1212,50000);
        it.addEmployee("Ananya",1258,100000);
        sales.addEmployee("Shyam",1220,75000);


        c1.getCompanyDetails();
    }
    
}
