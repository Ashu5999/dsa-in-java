package Stack;

import java.util.*;
public class PushBottom {


    public static void pushatbottom(Stack<Integer> s , int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s , data);
        s.push(top);

       // In recursion, statements after the recursive call are executed only when the recursive call returns.
       //  Therefore, s.push(top) remains pending until the base case is reached and the function starts returning.
    }
    public static void main(String args[]){
   Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    pushatbottom(s, 4);

    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
    }
    
}
