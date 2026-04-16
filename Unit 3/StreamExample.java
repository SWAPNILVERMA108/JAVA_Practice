import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(7);
        list.add(15);
        list.add(2);

        list.stream()
            .filter(n -> n % 2 == 1)
            .map(n -> n * n)
            .sorted()
            .forEach(n -> System.out.println(n));
    }
}

// w a p to create product class and initialize , id , name , price 
// another class  add at least 5 product in your array list 
//apply filter to sell only the product of whose price are > 30000 . select the price of the product only add that array 