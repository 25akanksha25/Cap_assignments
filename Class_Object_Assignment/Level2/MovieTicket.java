package Class_Object_Assignment.Level2;

import java.util.Scanner;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private int price;


    MovieTicket(String name)
    {
        movieName = name;
    }

    public void assignTicket(String seat, int p)
    {
        seatNumber = seat;
        price = p;
    }

    public void displayTicket()
    {
        System.out.println("Movie Name : "+movieName);
        System.out.println("Seat Number : "+seatNumber);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String seat = sc.nextLine();
        int price = sc.nextInt();

        MovieTicket mv = new MovieTicket(name);
        mv.assignTicket(seat, price);
        mv.displayTicket();
    }
}
