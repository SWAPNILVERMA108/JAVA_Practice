import java.io.*;
import java.util.*;

public class Program7a {
    public static void main(String[] args) throws Exception {

        System.out.println("----- 1) Command Line Arguments -----");
        String cmd = args.length > 0 ? args[0] : "Hello";
        System.out.println("Command Line Input : " + cmd);

        System.out.println("\n----- 2) DataInputStream -----");
        DataInputStream d = new DataInputStream(System.in);
        System.out.print("Enter input using DataInputStream: ");
        String data = d.readLine();

        System.out.println("\n----- 3) BufferedReader -----");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter input using BufferedReader: ");
        String buff = br.readLine();

        System.out.println("\n----- 4) Scanner -----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input using Scanner: ");
        String scan = sc.nextLine();

        System.out.println("\n----- 5) Console -----");
        Console c = System.console();
        String cons;
        if (c == null) {
            cons = "Console not supported in this IDE!";
            System.out.println(cons);
        } else {
            cons = c.readLine("Enter input using Console: ");
        }

        System.out.println("\n=========== OUTPUT ===========");
        System.out.println("Command Line Input : " + cmd);
        System.out.println("DataInputStream    : " + data);
        System.out.println("BufferedReader     : " + buff);
        System.out.println("Scanner            : " + scan);
        System.out.println("Console            : " + cons);

        sc.close();
    }
}