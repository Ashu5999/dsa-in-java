package practiceWork;
import java.util.*;
// Que 25 : Find the missing number from the array from 1 to n.
public class MissingNo {
    
    // Approach 1 : Using sum formula
    // public static void main(String args[]){

    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr [] = new int[n-1];
    //     for(int i = 0; i<n-1;i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     int sum = 0;
    //     int totalSum = n*(n+1)/2;
    //     for(int i =0;i<n-1;i++){
    //         sum+= arr[i];
    //     }
    //     int missing = totalSum - sum ;

    //     System.out.println("The missing number is " + missing );
    // }

    public static void main(String args[]){
    // By using the Xor 
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr [] = new int[n-1];
         for(int i = 0; i<n-1;i++){
            arr[i] = sc.nextInt(); 
        }
        
        // XOR elements from 1 to n
        int xor = 0;
        for(int i = 1; i<=n;i++){
            xor = xor ^ i;
        }

        int xor2 = 0;
        for(int i = 0; i<n-1 ;i++){
        xor2 = xor2 ^ arr[i];
        }
        int missing = xor ^ xor2;
        System.out.println("The missing number is " + missing);
    }
}
