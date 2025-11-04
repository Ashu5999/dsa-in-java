import java.util.*;
public class problem01 {

    public static int product(int a , int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = product(a , b);
        System.out.println("product of a and b is " + product);
        product =  product(50,50);
        System.out.print("product is = "  + product);
    }
    
}
