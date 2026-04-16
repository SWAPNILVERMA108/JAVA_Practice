 
 //Write a Java program to demonstrate Runtime Polymorphism (Method Overriding) by creating a base 
//class Shape and derived classes Circle and Rectangle to override the area() method and display the area of 
//each shape.
 class Program_4_c {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Program_4_c {

    void Circle() {   
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

     


// class Rectangle extends Program_4_c {
//     void area() {   
//         double length = 4.0;
//         double width = 3.0;
//         double area = length * width;
//         System.out.println("Area of Rectangle: " + area);
//     }
// }

    public static void main(String[] args) {
        Circle shape1 = new Circle();
        // Rectangle shape2 = new Rectangle();

        shape1.area(); 
        // shape2.area(); 
    }
}
