package Static_Final_InstanceOf.Level1;


class Patient
{
    private static String hospitalName = "Neelam Hospital";
    private static int totalPatients = 0;
    private final int patientId;

    private String name;
    private int age;
    private String alignment;

    Patient(int patientId,String name,int age,String alignment)
    {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.alignment= alignment;
        totalPatients++;
    }

    public static void getTotalPatients()
    {
        System.out.println("Total Number Of Patients : "+totalPatients);
    }

    public void displayDetails(Object obj)
    {
        if(obj instanceof Patient)
        {
            System.out.println("Hospital Name : "+hospitalName+"\nPatient Id : "+patientId+"\nPatient Name : "+name+"\nAge : "+age+"\nAlignment : "+alignment);
        }
    } 
}
public class Program7 {
    public static void main(String[] args) {
        Patient e = new Patient(1212,"Aman",21,"Fever");
        Patient.getTotalPatients();
        e.displayDetails(e);

    }
    
}
