package practiceWork;
import java.util.*;
public class Lcm {
   public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); int x = a;
    int b = sc.nextInt(); int y = b;
    int gcd = 1;
 int lcm;
 while(b!=0){
    int temp = b;
    b= a%b;
    a = temp;
 }
 gcd = a;
 lcm = (x*y)/gcd;
 System.out.print("the LCM is " + lcm);
   } 
}
