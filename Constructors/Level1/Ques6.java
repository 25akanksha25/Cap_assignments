package Constructors.Level1;

class CarRental
{
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int dailyCost = 5000;

    CarRental(String customerName, String carModel, int rentaldays)
    {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentaldays;
    }

    private int totalCost()
    {
        return rentalDays * dailyCost;
    }

    public void displayDetails()
    {
        System.out.println("Details : ");
        System.out.println("Customer Name : "+customerName+ "\nCar Model : "+carModel+"\nDays to rent : "+rentalDays+ "\nTotal Cost : "+totalCost());
    }

}

public class Ques6 {
    public static void main(String[] args) {
        CarRental c = new CarRental("Ram", "BMW", 10);
        c.displayDetails();
    }
    
}
