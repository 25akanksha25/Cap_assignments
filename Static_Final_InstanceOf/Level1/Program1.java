package Static_Final_InstanceOf.Level1;

class BankAccount
{
    private static String bankName = "Chitkara";
    private static int totalAccount = 0;
    
    private String accountHolderName;
    private final int accountNumber;

    BankAccount(String accountHolderName,int accountNumber)
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccount++;
    }


    
    public void displayDetails(Object obj)
    {
        if(obj instanceof BankAccount)
        {
            System.out.println("Bank Name : "+bankName+"\nAccount Holder Name : "+accountHolderName+"\nAccount Number : "+accountNumber);
        }
    }
        
    public static void getTotalAccount()
    {
        System.out.println("Total Accounts : "+totalAccount);
    }
        


}

public class Program1 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Ram",123456789);
        b.displayDetails(b);
        BankAccount.getTotalAccount();

    }
    
}
