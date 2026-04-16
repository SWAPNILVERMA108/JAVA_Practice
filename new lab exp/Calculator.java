public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
         System.out.println("Name: Swapnil Verma");
        System.out.println("Roll No: 2400320101154");
        Calculator obj=new Calculator();
        System.out.println("Addition of 2 integers: "+obj.add(4,17));
        System.out.println("Addition of 2 double: "+obj.add(4.0,17.0));
        System.out.println("Addition of 3 integers: "+obj.add(4,17,5));
    }
}
