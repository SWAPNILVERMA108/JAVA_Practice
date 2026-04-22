// static method =>   classname :: method name 
// Instance method => object :: method name
// constructor => classname :: new 


// example 1
// class Demo{
//     static void display(){
//         System.out.println("static method called");
//     }

// }

// Example 2

// class demo{
//     void show(){
//         System.out.println("Instance method called");
//     }
// }


// Example 3 

interface demo {
    test create();
}

class test{
    test(){
        System.out.println("constructor called");
    }
}

public class methodReference {
    // public static void main(String[] args) {
    //     Runnable r = Demo::display;
    //     r.run();
    // }

    // public static void main(String[] args) {
    //     demo obj = new demo();
    //     Runnable r = obj::show;
    //     r.run();
    // }


    public static void main(String[] args) {
        demo d = test::new;
        d.create();

    }
    
}
