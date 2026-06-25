package Stack;
import java.util.*;
public class NextGreEle {
    
    public static void main(String args[]){
        int arr[] = {6, 8, 0, 1, 3};
        Stack <Integer> s = new Stack<>();
        int result[] = new int[arr.length];   // result array is used to store the next greater element
                                              //   for each element in the input array. The size of the result array is the same as
                                              //  the input array, and it will hold the next greater element corresponding to each
                                              //  index of the input array.

        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i] = -1;
            }
            else{
                result[i] = s.peek();
            }
            s.push(arr[i]);
        }

        for(int i = 0; i<result.length;i++){
            System.out.println(result[i]);  // this loop is used to print the result array which contains the next greater element for each element in the input array.
        }
    }
}
