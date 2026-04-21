interface say{
    void speak();
}

public class lambda2 {
    public static void main(String[] args) {
        say obj = ()-> System.out.println("this is example of lambda function");
        obj.speak();
    }
    
}
