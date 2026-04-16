//  Write a program in java to implement the following types of inheritance: 
// • Multilevel Inheritance 

class A {
    void displayA() {
        System.out.println("This is class A");
    }
}
class B {
    void displayB() {
        System.out.println("This is class B");
    }
}
class C extends B {
    void displayC() {
        System.out.println("This is class C");
    }
}
class D extends A {
    void displayD() {
        System.out.println("This is class D");
    }
}
public class Program_3_a {
    public static void main(String[] args) {
        C c = new C();
        c.displayB(); 
        c.displayC(); 
    }
}


