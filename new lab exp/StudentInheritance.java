class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class StudentInheritance extends Person {
    int roll;
    String course;
    public StudentInheritance(String name,int age,int roll,String course){
        super(name,age);
        this.roll=roll;
        this.course=course;
    }
    public void displayStudent(){
        displayPerson();
        System.out.println("Roll No: "+roll);
        System.out.println("Course: "+course);
    }
    public static void main(String[] args) {
        System.out.println("Name: Swapnil Verma");
        System.out.println("Roll No: 2400320101154");
        StudentInheritance obj=new StudentInheritance("Mohan", 20, 205,"B.tech");
        obj.displayStudent();
    }
}
