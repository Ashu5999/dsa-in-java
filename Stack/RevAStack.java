package Stack;
import java.util.*;
public class RevAStack { 

    public static void pushatbottom(Stack<Integer> s , int top){

        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int data = s.pop();
        pushatbottom(s , top);
        s.push(data);

       // In recursion, statements after the recursive call are executed only when the recursive call returns.
       //  Therefore, s.push(top) remains pending until the base case is reached and the function starts returning.
    }

    public static void reverseStack(Stack<Integer> s){

        if(s.isEmpty()){
            return ;
        }
        int top = s.pop();
        reverseStack(s);
        pushatbottom(s, top);
    }

    public static void printStack(Stack<Integer> s ){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        
        reverseStack(s);
        printStack(s);




    }
   
    
}
