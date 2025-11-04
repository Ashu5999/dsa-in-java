import java.util.*;
public class problem03  {

    public static int factorial(int n){
        int f =1;
        for(int i = 1;i<=n; i++){
            f=f*i;
        }
        return f;
    }

    

    public static int bino(int n , int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);

        int bionco = a/(b*c);
        return bionco;
    }
    

    
   public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    System.out.println(bino(n,r));
   } 
}
