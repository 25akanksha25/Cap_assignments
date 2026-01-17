package Constructors.Instance_Class_Methods;


class Course
{
    String courseName;
    int duration;
    int fee;
    static String instituteName = "Chitkara";

    Course(String courseName, int duration, int fee)
    {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails()
    {
        System.out.println("Course Name : "+courseName+"\nDuration : "+duration+"\nFee : "+fee+"\nInstitute Name : "+instituteName);
    }

    public void updateInstituteName(String newName)
    {
        instituteName = newName;

    }

}

public class Ques2 {
    public static void main(String[] args) {
        Course c = new Course("Java",150,5000);
        c.displayCourseDetails();
        c.updateInstituteName("Chitkara University");
        c.displayCourseDetails();

    }
    
}
