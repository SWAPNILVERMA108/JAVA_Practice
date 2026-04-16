interface myInterface{
    void show();
}
public class lambda1 {
    public static void main(String[] args) {
        myInterface obj = ()->System.out.println("this is example of lambda function");
        obj.show();
    }
    
}
