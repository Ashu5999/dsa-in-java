package practiceWork;
import java.util.*;

public class factorial {
    
// ILTERATIVE APPROACH FOR FACTORIAL BEST APPROACH WITH TIME COMPLEXITY O(n) AND SPACE COMPLEXITY O(1)
    // public static void main (String args[]){
    //     Scanner sc = new Scanner (System.in);
    //     int n = sc.nextInt();

    //    long fact  = 1;
    //     for(int i = n; i>=1;i--){
    //         fact *=i;
    //     }
    //     System.out.println("the factorial of "+ n + " is " + fact);

    // }


    // RECURSIVE APPROACH FOR FACTORIAL WITH TIME COMPLEXITY O(n) AND SPACE COMPLEXITY O(n) DUE TO CALL STACK
    

    public static long recursive(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * recursive(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
       long ans =  recursive(n);
       System.out.println("the factorial is " + ans );
    }
}
