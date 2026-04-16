// write a program to create a class called person with private instance variables name , age and country and provide getter and setter methods for each variable. Create an object of the person class and set the values using the setter methods and display the values using the getter methods.

class Person {
    private String name;
    private int age;
    private String country;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
public class Person2 {
    public static void main(String[] args) {
        Person p = new Person();
        
        p.setName("Rohan");
        p.setAge(30);
        p.setCountry("india");
        
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Country: " + p.getCountry());
    }
}