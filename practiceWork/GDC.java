package practiceWork;
import java.util.*;
public class GDC {
 
    public static void main(String args[]){
        // first method checking each numnber
    //     Scanner sc = new Scanner (System.in);
    //     int a  = sc.nextInt();
    //     int b = sc.nextInt();
    //    int small = 0;
    //    int gdc = 1;
    //     if(a<b){
    //          small = a;
    //     }
    //     else{
    //         small = b;
    //     }
    //     for(int i = 1; i<=small ; i++){
    //         if(a%i==0 && b%i==0){
    // gdc = i;            }
    //     }
    
    // System.out.print("The Greatest commom factor is " + gdc);

    // 2nd method using Euclidean algorithm
    Scanner sc = new Scanner (System.in);
    int a  = sc.nextInt();
    int b = sc.nextInt();
     while(b!=0){
        int temp = b;
        b = a%b;
        a = temp;
     } 
        System.out.print("The Greatest commom factor is " + a);
}
}

