

public class shallowAnddeep {
    public static void main(String args[]) {
        Student s1 = new Student();  // default constructor
        s1.name = "Ashu";
        s1.age = 19;
        s1.roll = 53;
        s1.password = "abcd";

        // initialize marks
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

       
        Student s2 = new Student(s1);
        s2.password = "xyz";

        // Change marks of s1
        s1.marks[0] = 50;

        // Show marks of s2 to see if they are independent
        System.out.println("s2 marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

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
    int marks[];

    // Default constructor
     Student() {
         marks = new int[3]; // important to avoid NullPointerException
       System.out.println("Default constructor is called...");
    }

    // Shallow copy constructor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.roll = s1.roll;
    //     this.password = s1.password;
    //     this.marks = s1.marks;  // shares same array (shallow copy)
    // }

    // Deep copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
        this.roll = s1.roll;
        this.password = s1.password;

        // allocate new array and copy values
        this.marks = new int[3];
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
