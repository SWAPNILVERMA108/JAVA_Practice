interface NumericTest{
    boolean test(int n);
}
public class LambdaDemo1 {
    public static void main(String[] args) {
        NumericTest isEven = (n)->(n%2)==0;

        if(isEven.test(10))System.out.println("10  is even no ");
        if(!isEven.test(9))System.out.println("9 is odd no");
    }
    
}
