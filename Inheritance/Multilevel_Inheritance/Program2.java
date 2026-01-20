package Inheritance.Multilevel_Inheritance;


class Course
{
    String courseName;
    int duration;

    Course(String courseName, int duration)
    {
        this.courseName = courseName;
        this.duration = duration;
    }

}
class OnlineCourse extends Course
{
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName,int duration, String platform,Boolean isRecorded)
    {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

}
class PaidOnlineCourse extends OnlineCourse
{
    int discount;
    int fee;
    PaidOnlineCourse(String courseName,int duration, String platform,boolean isRecorded,int discount,int fee)
    {
        super(courseName, duration,platform,isRecorded);
        this.discount = discount;
        this.fee = fee;
    }


}
public class Program2 {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse("JAVA",150,"BridgeLabz",true,10,5000);
        System.out.println("Course Details :");
        System.out.println("Name : "+c.courseName+"\nDuration : "+c.duration+"\nPlatform : "+c.platform+"\nRecorder : "+c.isRecorded+"\nFee : "+c.fee+"\nDiscount : "+c.discount);

    }
    
}
