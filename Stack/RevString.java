package Stack;
import java.util.*;
public class RevString {
    
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");

        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);  // append() is a method of StringBuilder used to add characters, strings, or
            //  other values to the end of the existing content without creating a new object. ✅
        }
        
        return result.toString();  // tp change string builder to string
    }

    public static void main(String args[]){
        String str = "Ashutosh";
        
        System.out.println(reverse(str));
    }
}
