import java.util.ArrayList;
import java.util.List;

public class ArrayListExample{
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("Agra");
        list.add("Delhi");
        list.add("Meerut");
        System.out.println("Array list is "+list);
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(String s:list){
            System.out.println(s);
        }
        list.add("Ghaziabad");
        System.out.println(list);
        list.set(0,"Noida");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        list.clear();
        System.out.println("list is : "+ list);


        
    }
}


// write a java program to input marks of 10 students in array list and check wheater the avg. of these student's marks either write improve your marks and also add avg of these marks in given array list 
