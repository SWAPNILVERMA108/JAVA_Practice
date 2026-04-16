// Run Time Polymorphism

public class Animal {
    void sound(){
        System.out.println("All animal makes sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("cat meww");
    }
}
class Test {
public static void main(String args[]){
    Animal a = new Dog();
    a.sound();

    Cat a1 = new Cat();
    a1.sound();
    a1.meow();
    


    }

}
