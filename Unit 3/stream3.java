// Intermediate and Terminal Operations

import java.util.*;
public class stream3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream()
        .filter(x->x%2==0) // Intermediate 
        .map(x->x*2)  // Intermediate
        .forEach(System.out::println);  // Terminal
        
    }
}
