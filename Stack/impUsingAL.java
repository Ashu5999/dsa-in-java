package Stack;
import java.util.*;
public class impUsingAL {
 static class Stake{
    static ArrayList<Integer> list = new ArrayList<>();
     
    public static boolean isEmpty(){
        return list.size()==0;
     }

     //push 
     public static void push(int data){
        list.add(data);
     }

     //pop 
     public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
     } 
    
     //peek
     public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);

     }
    }

    public static void main(String args[]){
        // Stack s = new Stack();   // Static methods belong to the class rather than an object,
// so they can be called directly using the class name without creating an object.
        Stake.push(1);
        Stake.push(2);
        Stake.push(3);

        while(!Stake.isEmpty()){
            System.out.println(Stake.peek());
            Stake.pop(); 
        }
    }

}
