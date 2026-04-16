@FunctionalInterface
interface myInterface{
    void display();
}
public class functionalInterface1 {
    public static void main(String[] args) {
        myInterface obj = new myInterface() {
            public void display(){
                System.out.println("This is a example of functional interface");
            }
            
        };
        obj.display();
    }
}