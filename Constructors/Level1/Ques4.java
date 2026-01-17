package Constructors.Level1;


class HotelBooking
{
    private String guestName;
    private String roomType;
    private int nights;


    HotelBooking()
    {
        guestName = "unknown";
        roomType = "unknown";
        nights = 0;
    }
    HotelBooking(String guestName, String roomType, int nights)
    {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking h)
    {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    public void displayDetails()
    {
        System.out.println("Guest Name : "+guestName);
        System.out.println("Room Type : "+roomType);
        System.out.println("Total Nights : "+nights);

    }
}
public class Ques4 {
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Aman","Suite",4);
        HotelBooking h3 = new HotelBooking(h2);

        System.out.println("Default............");
        h1.displayDetails();
        System.out.println("Parameterized..........");
        h2.displayDetails();
        System.out.println("Copy ................");
        h3.displayDetails();


    }
}
