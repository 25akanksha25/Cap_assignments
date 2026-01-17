package Constructors.Level1;

class Person
{
    private String name;
    private String address;
    private int phoneNum;


    Person(String name,String address,int phoneNum)
    {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    Person(Person p)
    {
        this.name = p.name;
        this.address = p.address;
        this.phoneNum = p.phoneNum;

    }

    public void displayDetails()
    {
        System.out.println("Details : ");
        System.out.println("Name : "+name+ "\naddress : "+address+"\nphone Number: "+phoneNum);
    }

}
public class Ques3 {
    public static void main(String[] args) {
        Person p1 = new Person("aku", "123 villa", 1234567892);
        Person p2 = new Person(p1);

        System.out.println("Person 1 ...........");
        p1.displayDetails();

        System.out.println("Clone ..........");
        p2.displayDetails();
    }
    
}
