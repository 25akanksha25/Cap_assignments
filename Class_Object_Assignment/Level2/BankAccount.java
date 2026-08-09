package Class_Object_Assignment.Level2;

import java.util.Scanner;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;


    BankAccount(String acc,int num,double bal)
    {
        accountHolder = acc;
        accountNumber = num;
        balance = bal;
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited Amount : "+amount);
    }

    public void withdraw(double withAmount)
    {
        if(balance >= withAmount)
        {
            balance -= withAmount;
            System.out.println("Withdrawn Amount : "+withAmount);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public void currBalance()
    {
        System.out.println("Balance : "+balance);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int num = sc.nextInt();
        double balance = sc.nextDouble();

        
        double depAmount = sc.nextDouble();
        double withAmount = sc.nextDouble();
        BankAccount ba = new BankAccount(name, num, balance);
        ba.deposit(depAmount);

        ba.withdraw(withAmount);
        ba.currBalance();
    }
    
}
