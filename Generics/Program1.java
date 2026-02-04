package Generics;
import java.util.*;


abstract class Product {
    private String productName;

    Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public abstract String category();
}

class Electronic extends Product {
    Electronic(String name) {
        super(name);
    }

    public String category() {
        return "Electronics";
    }
}

class Grocery extends Product {
    Grocery(String name) {
        super(name);
    }

    public String category() {
        return "Groceries";
    }
}

class Furniture extends Product {
    Furniture(String name) {
        super(name);
    }

    public String category() {
        return "Furniture";
    }
}

class ItemBox<T extends Product> {
    private List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public List<T> getAll() {
        return list;
    }
}


class WarehousePrinter {
    public static void show(String title, List<? extends Product> items) {
        System.out.println("\n" + title);
        System.out.println("-------------------------");

        int count = 1;
        for (Product p : items) {
            System.out.println(count + ". Item Name : " + p.getProductName());
            System.out.println("   Category : " + p.category());
            count++;
        }
    }
}


public class Program1 {
    public static void main(String[] args) {

        ItemBox<Electronic> electronics = new ItemBox<>();
        electronics.add(new Electronic("Laptop"));
        electronics.add(new Electronic("Tablet"));

        ItemBox<Grocery> groceries = new ItemBox<>();
        groceries.add(new Grocery("Rice"));
        groceries.add(new Grocery("Milk"));

        ItemBox<Furniture> furniture = new ItemBox<>();
        furniture.add(new Furniture("Chair"));

        WarehousePrinter.show("ELECTRONICS SECTION", electronics.getAll());
        WarehousePrinter.show("GROCERY SECTION", groceries.getAll());
        WarehousePrinter.show("FURNITURE SECTION", furniture.getAll());
    }
}
