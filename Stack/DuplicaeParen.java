package Stack;
import java.util.*;
public class DuplicaeParen {
    

    public static boolean IsDuplicate(String str){
        Stack <Character> s = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            // closing bracket
            if(ch==')'){     // as we have only one condition for closing bracket so we can write it in if condition
                int count = 0;
                while(s.peek()!='('){ // here in plac eof peek we can also write a pop remove else pop to reduce line 
                                       // but it will give error if the stack is empty so we will write peek and then pop after that 
                    s.pop();
                    count++;
                }
                if (count<=0){
                    return true;
                }
                else{
                    s.pop();
                }
                }
                else{                  // as for push there are bracket , operator and oprand so we will put this in the else condition
                                      // as it is easy to write 
                    s.push(ch);
                }
            }
        return false;
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        System.out.println(IsDuplicate(str));
    }
}
