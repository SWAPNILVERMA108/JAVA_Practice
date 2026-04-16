interface sum{
    int add(int a,int b);
}
interface sub{
    int subs(int a,int b);
}

class cal implements sum,sub{
    public int add(int a , int b){
        return a+b;
    }
    public int subs(int a , int b){
        return a-b;
    }
}

public class calc {
    public static void main(String[] args) {
        cal c1 = new cal();
        System.out.println("addition of two no : "+ c1.add(22, 20));
        System.out.println("substraction of two no : "+c1.subs(40, 20));

    };

    
}
