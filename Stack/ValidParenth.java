package Stack;
import java.util.*;
public class ValidParenth {
    
    public static boolean checkstr(String str){   Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                else{
                    char top = s.peek();
                    if((ch==')' && top=='(') || (ch=='}' && top=='{') || (ch==']' && top=='[')){
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
     
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

        String str ;
        str = sc.nextLine();
        checkstr( str);
        System.out.println(checkstr(str));
    }
}
