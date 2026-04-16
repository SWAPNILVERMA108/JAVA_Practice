
class Teacher {

    int id;
    String name;
    String subject;
    double salary;

    // Constructor
    Teacher(int id, String name, String subject, double salary) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    // Method to display teacher details
    void display() {
        System.out.println("Teacher ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }

    // Main method
    public static void main(String[] args) {

        // Create object
        Teacher t1 = new Teacher(101, "Mr. Sharma", "Maths", 35000);

        // Call method
        t1.display();
    }
}

