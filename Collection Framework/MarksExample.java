
// write a java program to input marks of 10 students in array list and check wheater the avg.
// of these student's marks either write improve your marks and also add avg of these marks 
// in given array list 

import java.util.ArrayList;
import java.util.List;      
import java.util.Scanner;

public class MarksExample {
    public static void main(String args[]){
        List<Integer> marks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum =0;
        for(int i =0;i<10;i++){
            System.out.println("Enter the marks of student : "+ (i+1));
            int mark = sc.nextInt();
            marks.add(mark);
            sum += mark;

        }
        float avg = sum/10.0f;
        System.out.println("Average marks is : "+avg);
        if(avg<75){
            System.out.println("Improve your marks !");
        }
        else{
            System.out.println("Good job !");
        }

        
}

}
