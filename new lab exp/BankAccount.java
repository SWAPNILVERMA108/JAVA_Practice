import java.util.Scanner;
public class BankAccount {
    private String accHolder;
    private double balance;
    private int accountNo;
    private int PIN;
    BankAccount(String accHolder, double balance, int accountNo, int pin) {
        this.accHolder = accHolder;
        this.balance = balance;
        this.accountNo = accountNo;
        this.PIN = pin;
    }
    public void deposit(double amount, int acc) {
        if (acc == accountNo) {
            balance = amount + balance;
            System.out.println("Your current balance is : " + balance);
        } else {
            System.out.println("Incorrect acc number ");
        }
    }
    public void withdraw(double amount, int pin) {
        if (pin != PIN) {
            System.out.println("Pin is not correct ");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn successfully");
        }else {
            System.out.println("Balance is low ");
        }
}
public void display(){
    System.out.println("Account name of user is : " + accHolder);
    System.out.println("Balance of user is :" + balance);
    System.out.println("AccountNumber of user is : " + accountNo);
}
  public void display(int acc, int pin){
        if(accountNo == acc && pin == PIN){
            System.out.println("Account name of user is : " + accHolder);
            System.out.println("Balance of user is :" + balance);
            System.out.println("AccountNumber of user is : " + accountNo);
        }else{
            System.out.println("Invalid details");
        }
  }
    public static void main(String[] args) {
        System.out.println("Name: Swapnil Verma");
        System.out.println("Roll No: 2400320101154");
        while(true) {
            System.out.println("----------MENU DISPLAY OF BANK APP ---------");
            System.out.println("Enter the name of the user ");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            System.out.println("Enter the initial balance of the user ");
            double balance = sc.nextDouble();
            System.out.println("Enter the account number of the user ");
            int accountNo = sc.nextInt();
            System.out.println("Enter the pin of the user ");
            int pin = sc.nextInt();
            BankAccount bankAccount = new BankAccount(name,balance,accountNo,pin);
            bankAccount.display();
            System.out.println("Choose option from given below ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3.Display Your Details");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    double amount = sc.nextDouble();
                    accountNo = sc.nextInt();
                    bankAccount.deposit(amount,accountNo);
                    break;

                case 2:
                    System.out.println("Enter the amount to withdraw");
                    double with = sc.nextDouble();
                    System.out.println("Enter THE pin of the user ");
                    pin =sc.nextInt();
                    bankAccount.withdraw(with,pin);
                    break;

                case 3:
                    System.out.println("Enter the account No");
                    accountNo = sc.nextInt();
                    System.out.println("Enter the pin");
                    pin = sc.nextInt();
                    bankAccount.display(accountNo,pin);
                    break;
                default:
                    System.out.println("please try again later ... ");
            }
        }
    }
}
