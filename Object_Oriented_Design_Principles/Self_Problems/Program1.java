package Object_Oriented_Design_Principles.Self_Problems;
import java.util.*;


class School
{
    private String name;
    List<Student> allStu;

    School(String name)
    {
        this.name = name;
        allStu = new ArrayList<>();
    }

    void addStudent(Student s)
    {
        allStu.add(s);
    }

    public void schoolStudents()
    {
        System.out.println("All Students in "+name+" :----------> ");
        for(Student s : allStu)
        {
            s.studentDetails();
        }
    }


}
class Course
{
    private String name;
    List<Student> stuList;

    Course(String name)
    {
        this.name = name;
        stuList = new ArrayList<>();
    }

    void addStudent(Student s)
    {
        stuList.add(s);
    }

    public void courseDetails()
    {
        System.out.println("Course Name : "+name);
        System.out.println("Students Enrolled :------------> ");
        for(Student s : stuList)
        {
            s.studentDetails();
        }
    }
    

}
class Student
{
    private String name;
    private int id;
    List<Course> allCourse;

    Student(String name,int id)
    {
        this.name = name;
        this.id = id;
        allCourse = new ArrayList<>();
    }

    public void studentDetails()
    {
        System.out.println("Name : "+name+", ID : "+id);
    }

    public void coursesEnrolled(Course c)
    {
        allCourse.add(c);

    }


}
public class Program1 {
    public static void main(String[] args) {
        School sc = new School("Chitkara");

        Course c1 = new Course("Java");
        Course c2 = new Course("AI");

        Student s1 = new Student("Ram",1212);
        Student s2 = new Student("Shyam",1220);

        sc.schoolStudents();
        
        sc.addStudent(s2);
        sc.addStudent(s1);

        c1.addStudent(s2);
        c2.addStudent(s1);
        c2.addStudent(s2);
        
        // s1.coursesEnrolled(c2);
        // s2.coursesEnrolled(c2);
        // s2.coursesEnrolled(c1);

        c1.courseDetails();
        c2.courseDetails();






    }
    
}
