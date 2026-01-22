package Object_Oriented_Design_Principles.Assisted_Problems;


class Customer
{
    private String name;
    private int accountNumber;
    private double balance;

    Customer(String name,int accountNumber,double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double viewBalance()
    {
        return balance;
    }

    
}
class Bank
{
    private String name;

    Bank(String name)
    {
        this.name = name;
    }

    public void openAccount(Customer cust)
    {
        System.out.println("Bank Name : "+name);
        System.out.println("Details :-------------- "+"\nHolder Name : "+cust.getName()+"\nAccount Number : "+cust.getAccountNumber()+"\nBalnace : "+cust.viewBalance());
    }


}
public class Program2 {
    public static void main(String[] args) {
        
        Customer c1 = new Customer("Ram", 123456789, 1000);
        Customer c2 = new Customer("Shyam", 1223654,50000);

        Bank b1 = new Bank("HDFC");

        b1.openAccount(c2);
        b1.openAccount(c1);

    }
    
}
