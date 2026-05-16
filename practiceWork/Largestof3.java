package practiceWork;
import java.util.*;
public class Largestof3 {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c= sc.nextInt();

    if(a>b && a>c){
        System.out.print("the largest number is " + a);
    }
    else if(b>a && b>c){
        System.out.print("the largest number is " + b);
    }
    else{
        System.out.print("the largest number is " + c);
    }
  }  
}
