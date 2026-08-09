package Inheritance.Single_Inheritance;

class Device
{
    int deviceId;
    String status;

    Device(int deviceId, String status)
    {
        this.deviceId = deviceId;
        this.status = status;
    }
}
class Thermostat extends Device
{
    int temperatureSetting;

    Thermostat(int deviceId, String status, int temperatureSetting)
    {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus()
    {
        System.out.println("Device Id : "+deviceId+"\nStatus : "+status+"\nTemperatue Settings : "+temperatureSetting);
    }

}
public class Problem2 {
    public static void main(String[] args) {
        Thermostat t = new Thermostat(12345, "On", 25);
        t.displayStatus();
    }
    
}
