import java.util.Scanner;
public class Main5D {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Not Eligible: Age must be 18 or above!");
        } else {
            System.out.println("Eligible: You can vote!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: Swapnil Verma");
        System.out.println("Roll No: 2400320101154");
        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            checkAge(age);
        }catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }sc.close();
    }
}
