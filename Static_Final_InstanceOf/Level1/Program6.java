package Static_Final_InstanceOf.Level1;


class Vehicle
{
    private final int registrationNumber;
    private static int registrationFee = 10000;

    private String ownerName;
    private String vehicleType;

    Vehicle(String ownerName,String vehicleType,int registrationNumber)
    {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateregistrationFee(int newFee)
    {

        registrationFee = newFee;
    }

    public void displayDetails(Object obj)
    {
        if(obj instanceof Vehicle)
        {
            System.out.println("Registration Number  : "+registrationNumber+"\nOwner Name : "+ownerName+"\nVehicle Type : "+vehicleType+"\nRegistration Fee : "+registrationFee);
        }
    } 
}
public class Program6 {
    public static void main(String[] args) {
        Vehicle e = new Vehicle("Rama","Automatic",1212);
        Vehicle.updateregistrationFee(20000);
        e.displayDetails(e);

    }
    
}
