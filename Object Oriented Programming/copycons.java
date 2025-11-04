

public class copycons {
    public static void main(String args[]) {
        Student s1 = new Student();  // default constructor
        s1.name = "Ashu";
        s1.age = 19;
        s1.roll = 53;
        s1.password = "abcd";

        // Copy constructor is called here
        Student s2 = new Student(s1);
        s2.password = "xyz";

        // Show values
        System.out.println("s1: " + s1.name + " " + s1.age + " " + s1.roll + " " + s1.password);
        System.out.println("s2: " + s2.name + " " + s2.age + " " + s2.roll + " " + s2.password);
    }
}

class Student {
    String name;
    int age;
    int roll;
    String password;

    // Default constructor
    Student() {
        System.out.println("Default constructor is called...");
    }

    // Copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
        this.roll = s1.roll;
        this.password = s1.password;
    }
}
