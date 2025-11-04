// PRINT 1 TO 10 USING WHILE LOOP
import java.util.*;
public class print1to10 {
 public static void main(String args[]){
    Scanner sc = new Scanner (System.in);

    int count =1;
    while(count<=10){
        System.out.print(count + " ");
        count++;
    }

    int n = sc.nextInt();
    while(count<=n){
        System.out.print(count + " ");
        count++;
    }
 }
    
}
