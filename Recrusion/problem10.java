public class problem10 {
    public static int power(int x, int n){
       if(n==0){                // base case
        return 1;
       }
     int halfPower = power(x , n/2) ;
     int result = halfPower*halfPower;
     // if nis odd
     if(n % 2 != 0){
       result = x *  result;
     }
     return result;

    }
    public  static void main(String args[]){
        int x = 2; int n = 9;
        System.out.println(power(x,n));
    }
}
 