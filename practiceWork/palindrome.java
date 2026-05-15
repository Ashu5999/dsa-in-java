package practiceWork;
import java.util.*;
public class palindrome {
    
   public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();

    int temp  = n ;
    int rev = 0;
    while(n!=0){
        int a = n%10;
        rev = rev *10 + a;
        n = n/10;
    }

    System.out.println( temp == rev ? "Palindrome" : "Not Plaindrome");  // 
   } 
}
