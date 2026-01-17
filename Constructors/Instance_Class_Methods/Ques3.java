package Constructors.Instance_Class_Methods;


class Vehicle
{
    String ownerName;
    String vehicleType;
    static int registrationFee = 10000;

    Vehicle(String ownerName, String vehicleType)
    {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }


    public void displayOwnerDetails()
    {
        System.out.println("Owner Name : "+ownerName+"\nVehicleType : "+vehicleType+"\nRegistration Fee : "+registrationFee);
    }

    public void updateRegistrationFee(int newFee)
    {
        registrationFee = newFee;

    }

}

public class Ques3 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Aman","Automatic");
        v.displayOwnerDetails();
        v.updateRegistrationFee(50000);
        v.displayOwnerDetails();
        
    }
}
