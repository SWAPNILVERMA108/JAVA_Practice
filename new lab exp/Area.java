class Shape {
    void area() {
        System.out.println("Area of a generic shape is undefined.");
    }
}
class Circle extends Shape {
    double radius;
    Circle(double r) {
        this.radius = r;
    }
    void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}
public class Area {
    public static void main(String[] args) {
         System.out.println("Name: Swapnil Verma");
        System.out.println("Roll No: 2400320101154");
        Shape s1 = new Circle(5.0);
        Shape s2 = new Rectangle(4.0, 6.0);
        s1.area(); 
        s2.area(); 
    }
}

