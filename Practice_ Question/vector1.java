import java.util.Stack;
import java.util.Vector;

// public class vector1 {
// public static void main(String args[]){
//     Vector <String> vec = new Vector<>(5);
//     vec.add("Swapnil");
//     vec.add("Verma");
//     vec.add("2400320101154");
//     System.out.println("Name: " + vec.get(0) + " " + vec.get(1));
//     System.out.println("Roll No: " + vec.get(2));   
// }
    
// }


// insert 5 student  name in stack and perform serarch operation on stack and display the result.

// public class vector1{
//     public static void main(String args[]){
//         Vector <String> vec = new Vector<>(5);
//         vec.add("aman");
//         vec.add("swapnil");
//         vec.add("john");
//         vec.add("ravi");
//         vec.add("sachin");
//         String searchName = "John";
//         if(vec.contains(searchName)){
//             System.out.println(searchName + " found");
//         } else {
//             System.out.println(searchName + " not found ");
//         }
//         System.out.println(vec.firstElement());
//         System.out.println(vec.lastElement());
//         System.out.println(vec.remove(4));
        
//     }
    
// }


public class vector1{
    public static void main(String args[]){

        Stack <String> stack = new Stack<>();
        stack.push("aman");
        stack.push("swapnil");
        stack.push("john");
        stack.push("ravi");
        stack.push("sachin");
        
        System.out.println(stack.search("aman"));
        System.out.println(stack.peek());
        System.out.println(stack.lastElement());
        System.out.println(stack.pop()); 
        

        

       
        
        
    }
    
}