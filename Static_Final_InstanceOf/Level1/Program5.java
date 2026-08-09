package Static_Final_InstanceOf.Level1;


class Student
{
    private static String universityName = "Chitkara University";
    private static int totalStudents = 0;
    private final int rollNumber;

    private String name;
    private char grade;

    Student(String name,int rollNumber,char grade)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents()
    {
        System.out.println("Total Number Of Students : "+totalStudents);
    }

    public void displayDetails(Object obj)
    {
        if(obj instanceof Student)
        {
            System.out.println("University Name : "+universityName+"\nStudent Id : "+rollNumber+"\nStudent Name : "+name+"\nGrade : "+grade);
        }
    } 
}
public class Program5 {
    public static void main(String[] args) {
        Student e = new Student("Aman",1212,'A');
        Student.displayTotalStudents();
        e.displayDetails(e);

    }
    
}
