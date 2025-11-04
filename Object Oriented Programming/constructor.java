

public class constructor {
    public static void main(String args[]){
    Student s1 = new Student();
}
}

class Student{
    String name;
    int age;
    Student(){ // constructor
        System.out.println("constructor is called...");
    }
}