class Student {
    String name;
    int rollNumber;
    String deptName;
    String collegeName;

    Student() {
        deptName = "cse";
        collegeName = "ABES";
    }

    Student(String name, int rollNumber) {
        this();
        this.name = name;
        this.rollNumber = rollNumber;
    }

    Student(Student obj) {
        this.name = obj.name;
        this.rollNumber = obj.rollNumber;
        this.deptName = obj.deptName + "Technology";
        this.collegeName = obj.collegeName + "Engineering College";
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department Name: " + deptName);
        System.out.println("College Name: " + collegeName);
    }
}

public class student1 {
    public static void main(String args[]) {
        Student student1 = new Student();
        Student student2 = new Student("John", 101);

        System.out.println("Student 1 Details:");
        student1.display();

        System.out.println("\nStudent 2 Details:");
        student2.display();
    }
}
