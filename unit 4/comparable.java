// comprable is used to define natural/default sorting order of objects
// it is present in java.lang package

import java.util.*;
class student implements Comparable<student>{

    String name;
    int age;

    student(String name , int age){
        this.name = name;
        this.age = age;
    }
    public int compareTo(student s){
        return this.age-s.age;
    }
}
public class comparable{
    public static void main(String[] args) {
        List<student> list = new ArrayList<>();
        list.add(new student("swapnil verma", 20));
        list.add(new student("Aman", 18));

        Collections.sort(list);

        for(student s: list){
            System.out.println(s.age +" " + s.name);
        }

    }
}