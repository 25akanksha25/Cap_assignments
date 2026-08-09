package Encapsulation_Polymorphism_Interface;

import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleType;
    protected double ratePerDay;

    public Vehicle(String vehicleNumber, String vehicleType, double ratePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.ratePerDay = ratePerDay;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return vehicleType;
    }

    public double getRentalRate() {
        return ratePerDay;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {

    private String policyNo;

    public Car(String vehicleNumber, double ratePerDay, String policyNo) {
        super(vehicleNumber, "Car", ratePerDay);
        this.policyNo = policyNo;
    }

    public double calculateRentalCost(int days) {
        return days * ratePerDay;
    }

    public double calculateInsurance() {
        return 600;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Number: " + policyNo;
    }
}

class Bike extends Vehicle {

    public Bike(String vehicleNumber, double ratePerDay) {
        super(vehicleNumber, "Bike", ratePerDay);
    }

    public double calculateRentalCost(int days) {
        return days * ratePerDay;
    }
}

class Truck extends Vehicle implements Insurable {

    private String policyNo;

    public Truck(String vehicleNumber, double ratePerDay, String policyNo) {
        super(vehicleNumber, "Truck", ratePerDay);
        this.policyNo = policyNo;
    }

    public double calculateRentalCost(int days) {
        return (days * ratePerDay) + 300;
    }

    public double calculateInsurance() {
        return 1200;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Number: " + policyNo;
    }
}


public class Program3 {
    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Car("CAR555", 1800, "CAR-POL-555"));
        vehicleList.add(new Bike("BIKE888", 650));
        vehicleList.add(new Truck("TRUCK999", 4500, "TRUCK-POL-999"));

        int totalDays = 5;

        for (Vehicle v : vehicleList) {

            double rentAmount = v.calculateRentalCost(totalDays);
            double insuranceAmount = 0;

            if (v instanceof Insurable) {
                Insurable insuredVehicle = (Insurable) v;
                insuranceAmount = insuredVehicle.calculateInsurance();
            }

            System.out.println("Vehicle Category : " + v.getType());
            System.out.println("Vehicle ID       : " + v.getVehicleNumber());
            System.out.println("Rent Cost        : " + rentAmount);
            System.out.println("Insurance Cost   : " + insuranceAmount);
            System.out.println("--------------------------------");
        }
    }
}