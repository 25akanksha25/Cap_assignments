package Encapsulation_Polymorphism_Interface;
import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {

    private int id;
    private String productName;
    private double cost;

    public Product(int id, String productName, double cost) {
        this.id = id;
        this.productName = productName;
        this.cost = cost;
    }

    public int getProductId() {
        return id;
    }

    public String getName() {
        return productName;
    }

    public double getPrice() {
        return cost;
    }

    public void setPrice(double cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double cost) {
        super(id, name, cost);
    }

    public double calculateDiscount() {
        return getPrice() * 0.12;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "GST @18% on Electronics";
    }
}

class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double cost) {
        super(id, name, cost);
    }

    public double calculateDiscount() {
        return getPrice() * 0.25;
    }

    public double calculateTax() {
        return getPrice() * 0.10;
    }

    public String getTaxDetails() {
        return "GST @10% on Clothing";
    }
}

class Groceries extends Product {

    public Groceries(int id, String name, double cost) {
        super(id, name, cost);
    }

    public double calculateDiscount() {
        return getPrice() * 0.07;
    }
}



public class Program2 {

    public static void main(String[] args) {

        List<Product> itemList = new ArrayList<>();

        itemList.add(new Electronics(101, "Smartphone", 45000));
        itemList.add(new Clothing(102, "Sweatshirt", 2500));
        itemList.add(new Groceries(103, "Wheat Flour", 1200));

        displayBill(itemList);
    }

    public static void displayBill(List<Product> itemList) {

        for (Product p : itemList) {

            double baseAmount = p.getPrice();
            double discountAmount = p.calculateDiscount();
            double taxAmount = 0;

            if (p instanceof Taxable) {
                Taxable taxableItem = (Taxable) p;
                taxAmount = taxableItem.calculateTax();
            }

            double payableAmount = baseAmount + taxAmount - discountAmount;

            System.out.println("Item Name      : " + p.getName());
            System.out.println("Original Price : " + baseAmount);
            System.out.println("Discount Given : " + discountAmount);
            System.out.println("Tax Applied    : " + taxAmount);
            System.out.println("Amount to Pay  : " + payableAmount);
            System.out.println("--------------------------------");
        }
    }
}