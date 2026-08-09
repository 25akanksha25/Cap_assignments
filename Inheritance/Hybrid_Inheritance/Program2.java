package Inheritance.Hybrid_Inheritance;

interface Refuelable
{
    void refuel();
}
class Vehicle
{
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed,String model)
    {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle
{
    ElectricVehicle(int maxSpeed,String model)
    {
        super(maxSpeed, model);
    }

    void charge()
    {
        System.out.println("The Car is Charged"+"\nMaxSpeed : "+maxSpeed+"\nModel : "+model);
    }

}
class PetrolVehicle extends Vehicle implements Refuelable
{
    PetrolVehicle(int maxSpeed,String model)
    {
        super(maxSpeed, model);
    }

    public void refuel()
    {
        System.out.println("Its time to Refuel the car"+"\nMaxSpeed : "+maxSpeed+"\nModel : "+model);
    }

}
public class Program2 {
    public static void main(String[] args) {
        ElectricVehicle v = new ElectricVehicle(150, "Mercedes");
        Refuelable v1 = new PetrolVehicle(250, "BMW");
        v.charge();
        v1.refuel();
    }
    
}
