//Write a Java program to create a BankAccount class using encapsulation (private data members) and 
//perform operations such as deposit, withdraw, and display balance using menu-driven choices.
public class Program_3_b {
    private String AcNumber;
    private String AcHName;
    private double balance;

    public Program_3_b(String AcNumber, String AcHName, double iBalance) {
        this.AcNumber = AcNumber;
        this.AcHName = AcHName;
        this.balance = iBalance;
    }

    public void deposit(double amount) {
       balance += amount;
    }
        
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + AcNumber);
        System.out.println("Account Holder Name: " + AcHName);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Program_3_b account1 = new Program_3_b("123456789", "swapnil", 1000.0);

        account1.displayBalance();
        System.out.println();

        account1.deposit(500.0);
        account1.displayBalance();
        System.out.println();

        account1.withdraw(200.0);
        account1.displayBalance();
    }
    
}
