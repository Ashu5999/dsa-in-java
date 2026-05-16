package practiceWork;
import java.util.*;
public class Armstrong {
  
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int temp = n;
   int temp2= n;
   int sum = 0;
   int count = 0;
   while(temp!=0){
   temp = temp/10;
   count++;
   } 
   while(temp2!=0){
    int a = temp2 % 10;
    sum = sum +(int) Math.pow(a, count);
    temp2 = temp2/10;
   }
   System.out.println(n == sum ? "yes,Armstrong" : "No, Not Armstrong");
}
}
