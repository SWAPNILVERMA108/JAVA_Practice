//Write a Java program to create a Student class, initialize student details using a parameterized 
//constructor, and display the student information using class objects and member functions. 

public class Program_3_a {
    private String name;
    private int age;
    private String studentId;

    public Program_3_a(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }

    public static void main(String[] args) {
        Program_3_a student1 = new Program_3_a("Tom", 20, "S001");
        Program_3_a student2 = new Program_3_a("Mohan", 22, "S002");

        student1.displayStudentInfo();
        System.out.println(); 
        student2.displayStudentInfo();
    }
}