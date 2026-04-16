abstract class Shape {
    abstract void draw();

    void info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape s = new Circle();

        s.info();
        s.draw();
    }
}
