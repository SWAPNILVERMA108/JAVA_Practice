import java.util.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Employee{
    String name();
    String address();
}

@Employee(name = "swapnil verma", address = "noida")
public class Annotation1 {
    public static void main(String[] args) {
        Employee obj = Annotation1.class.getAnnotation(Employee.class);
        System.out.println("Name: " + obj.name() + ", Address: " + obj.address());
    }   
}

// write a java to write game name annotation and take two value and type of game and print the second name of schedule date take 5 valuee adn take the input from user and of the game type and currosponding schedule date






