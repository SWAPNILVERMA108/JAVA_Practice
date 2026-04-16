//Compile-Time Polymorphism

class Addition{
    int add(int a,int b){
        return a+b;
    }
    int add(int a , int b , int c){
        return a+b+c;
    }
public static void main(String args[]){
Addition obj = new Addition();
System.out.println(obj.add(12, 70));
System.out.println(obj.add(10,20,30));
}


}
