class A{
    void displayA(){
        System.out.println("This is class A");
    }
}
class B extends A{
    void displayB(){
        System.out.println("This is class B");
    }
}
public class Program_3_b {
    public static void main(String[] args) {
        B b = new B();
        b.displayA(); 
        b.displayB(); 
    }
    
}
