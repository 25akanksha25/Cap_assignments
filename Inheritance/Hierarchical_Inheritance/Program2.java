package Inheritance.Hierarchical_Inheritance;

class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void displayRole()
    {
        System.out.println("Person :->"+"\nName : "+name+"\nAge : "+age);
    }
}

class Teacher extends Person
{
    String subject;
    Teacher(String name, int age,String subject)
    {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole()
    {
        System.out.println("Teacher :-> "+"\nName : "+name+"\nAge : "+age+"\nSubject :"+subject);
    }

}
class Student extends Person
{
    char grade;
    Student(String name, int age,char grade)
    {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole()
    {
        System.out.println("Student :-> "+"\nName : "+name+"\nAge : "+age+"\nGrade : "+grade);
    }
    
}
class Staff extends Person
{
    String role;
    Staff(String name,int age,String role)
    {
        super(name, age);
        this.role = role;
    }

    public void displayRole()
    {
        System.out.println("Staff :-> "+"\nName : "+name+"\nAge : "+age+"\nRole : "+role);
    }
    
}
public class Program2 {
    public static void main(String[] args) {
        Person b = new Person("Rama",24);
        Person b1 = new Teacher("Shyam",25,"Maths");
        Person b2 = new Student("Adi",20,'A');
        Person b3 = new Staff("Raman",35,"Professor");
        b.displayRole();
        b1.displayRole();
        b2.displayRole();
        b3.displayRole();

        
    }
    
}
