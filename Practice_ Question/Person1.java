class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Person1 {
    public static void main(String[] args) {
        Person p1 = new Person("aman", 20);
        Person p2 = new Person("tom", 25);

        p1.displayInfo();
        p2.displayInfo();
    }
}