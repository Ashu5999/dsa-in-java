
import java.util.*;
public class funcWithPara2 {
    
    public static void calculateSum(int a , int b){ // parameter or formal parameter
        int sum = a + b;
        System.out.println("sum is =" + sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a,b); // here a and b are called  argument or actual argument

    }
    
}
