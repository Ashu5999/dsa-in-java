public class StsticKeyword {
    public static void main(String args[]){
        Student s1 =  new Student();
        s1.school = "STS";    // here school is static only value give remain same for others
        
        Student s2 = new Student();
        System.out.println(s2.school);

        Student s3 = new Student();
        s3.school = "SPS";
     
    }
}
class Student{
    String name;
    int roll;
    static String school;

    void setname(String name){
        this.name= name;
    }
    String getname(){
        return this.name;
    }
}
