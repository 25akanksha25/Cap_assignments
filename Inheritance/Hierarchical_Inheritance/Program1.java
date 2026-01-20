package Inheritance.Hierarchical_Inheritance;

class BankAccount
{
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType()
    {
        System.out.println("This is Your Bank Account"+"\nAccount Number : "+accountNumber+"\nBalance : "+balance);
    }
}

class SavingsAccount extends BankAccount
{
    int interestRate;
    SavingsAccount(int accountNumber, double balance,int interestRate)
    {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType()
    {
        System.out.println("This is your Savings Account"+"\nInterest Rate : "+interestRate+" %");
    }

}
class CheckingAccount extends BankAccount
{
    int withdrawalLimit;
    CheckingAccount(int accountNumber, double balance,int withdrawalLimit)
    {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType()
    {
        System.out.println("This is your Checking Account"+"\nWithdrawal Limit  : "+withdrawalLimit);
    }
    
}
class FixedDepositAccount extends BankAccount
{
    FixedDepositAccount(int accountNumber,double balance)
    {
        super(accountNumber, balance);
    }

    public void displayAccountType()
    {
        System.out.println("This is your Fixed Deposit Account");
    }
    
}
public class Program1 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(123456789, 10000);
        BankAccount b1 = new SavingsAccount(123456789, 5500, 5);
        BankAccount b2 = new CheckingAccount(123456789, 6000, 5000);
        BankAccount b3 = new FixedDepositAccount(123456789, 9000);
        b.displayAccountType();
        b1.displayAccountType();
        b2.displayAccountType();
        b3.displayAccountType();

        
    }
    
}
