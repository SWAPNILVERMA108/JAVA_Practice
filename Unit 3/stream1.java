import java.util.*;
import java.util.stream.*;
public class stream1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,20,30);

        List<Integer> result = list.stream()
        .filter(x->x>20)
        .map(x->x*3)
        .distinct()
        .sorted()
        .peek(x-> System.out.println("processing: "+x))
        .limit(3)
        .skip(1)
        .collect(Collectors.toList());


System.out.println("Final List :"+ result);



    }
    
}
