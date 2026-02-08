package Regex;

public class Program2 {

    public static boolean isValidPlate(String plate) 
    {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        return plate.matches(regex);
    }
    
    public static void main(String[] args) 
    {
        String[] plates = {"AB1234", "A12345", "ab1234", "AB12C4", "XY9999"};
        for (String plate : plates) 
        {
            System.out.println(plate + " → " + (isValidPlate(plate) ? "Valid" : "Invalid"));
        }
    }
}
