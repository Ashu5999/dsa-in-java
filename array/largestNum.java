
import java.util.*;
public class largestNum {
    public static int larger(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE; 
        for(int i=0;i<num.length; i++){   
            if(largest < num[i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("smallest number = " + smallest);
         return largest;
    }

    public static void main(String args[]){
        int num[]= {1,2,6,3,8,5,9,10};
     
        System.out.println("largest number = " + larger(num));


    }

    
}
