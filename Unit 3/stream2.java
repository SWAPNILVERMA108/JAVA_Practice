import java.util.*;

public class stream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
        .filter(x->x%2==0)
        .forEach(System.out::println);
    }
    
}
