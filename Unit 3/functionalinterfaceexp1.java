@FunctionalInterface
interface add{
    int sum(int a, int b);
}

public class functionalinterfaceexp1 {
    public static void main(String[] args) {
        add obj = (a,b)->a+b;
        System.out.println(obj.sum(20,30));
    }
    
}
