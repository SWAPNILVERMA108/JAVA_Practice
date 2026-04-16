import java.io.*;

public class Program7b {
    public static void main(String[] args) {

        Console c = System.console();

        if (c == null) {
            System.out.println("Console not available");
            return;
        }

        String user = c.readLine("Enter Username: ");
        char[] passArr = c.readPassword("Enter Password: ");
        String pass = new String(passArr);

        System.out.println("\nLogin Details:");
        System.out.println("Username: " + user);
        System.out.println("Password: " + pass);
    }
}