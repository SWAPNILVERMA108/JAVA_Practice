import java.util.Scanner;
class BankAccount {
    private String accHolder;
    private int accNo;
    private double balance;
    public BankAccount(String accHolder, int accNo, double balance) {
        this.accHolder = accHolder;
        this.accNo = accNo;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful!");
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    public void display() {
        System.out.println("Account Details");
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Account No : " + accNo);
        System.out.println("Balance : " + balance);
    }
}
public class Program_3_b_1 {
    public static void main(String[] args) {
        System.out.println("Name : Swapnil Verma");
        System.out.println("Roll NO : 2400320101154");
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount("Ravi", 101, 5000);

        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    account.display();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}