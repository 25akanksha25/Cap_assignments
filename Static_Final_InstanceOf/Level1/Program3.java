package Static_Final_InstanceOf.Level1;

class Employee
{
    private static String companyName = "Capgemini";
    private static int totalEmp = 0;

    private String name;
    private String designation;
    private final int id;

    Employee(String name,String designation,int id)
    {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmp++;
    }

    public static void displayTotalEmployees()
    {
        System.out.println("Total Number Of Employees : "+totalEmp);
    }

    public void displayDetails(Object obj)
    {
        if(obj instanceof Employee)
        {
            System.out.println("Company Name : "+companyName+"\nName : "+name+"\nDesignation : "+designation+"\nID : "+id);
        }
    } 
}
public class Program3 {
    public static void main(String[] args) {
        Employee e = new Employee("Aku","Manager", 1212);
        Employee e2 = new Employee("Ram","Senior Manager", 1220);
        e.displayDetails(e);
        e2.displayDetails(e2);
        Employee.displayTotalEmployees();

    }
    
}
