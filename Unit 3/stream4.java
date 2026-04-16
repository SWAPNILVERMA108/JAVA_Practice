import java.util.*;
public class stream4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = list.stream()
                      .filter(x-> x%2==0)
                      .mapToInt(Integer::intValue)
                      .sum();
                      System.out.println("sum of even no : "+ sum);
        
    }
    
}
