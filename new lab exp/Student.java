public class Student {
    String name;
    int rollNo;
    double marks;
    Student(String name,int rollNo,double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public void Display(){
        System.out.println("Name of the Student is : " + name);
        System.out.println("RollNo of the student is : " + rollNo);
        System.out.println("Marks of the student is : " + marks);
    }
    public static void main(String[] args) {
      System.out.println("Name: Swapnil Verma");
        System.out.println("Roll No: 2400320101154");
        Student s = new Student("Swapnil", 205, 99.5);
        s.Display();
}
}
