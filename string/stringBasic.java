
import java.util.*;
public class stringBasic {
    
    public static void main(String args[]){
        char arr[] = {'a' , 'b','c','d'};
     // decleration of string
        String str1 = "abcd";
        String str2= new String("xyz");

        // string are IMMUTABLE
//      input and output of string
        Scanner sc = new Scanner (System.in);
        String name;
        name = sc.nextLine();
        System.out.println("the string is = " + name);

        // string length
        System.out.println( " length of a  string is =" +name.length());

        // concatination
        String first = "ashu";
        String last = "tiwari";
        String fullname = first+" "+ last;
        System.out.println("full name is =" + fullname);
    }
}
