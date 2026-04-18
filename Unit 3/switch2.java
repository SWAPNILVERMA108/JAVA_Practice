import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String s = switch(n)
        {
        case "Monday","Tuesday","Wednesday","Thursday", "Friday"-> "Weekday";
        case "Saturday", "Sunday" -> "Weekend";

        };
        System.out.println(s);
        



    }
    
}
