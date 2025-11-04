public class problem04 {
    
    public static boolean isPrime(int n){
        
        if (n ==2){
            System.out.println("it is a prime");
           return true;
        }
        

        for(int i =2; i<=n-1;i++){
            if (n%i ==0){
               System.out.println("it is not a prime");
                return false;
             
            }
           
        }
        System.out.println("it is a prime");
        return true;
    }

    public static void main(String agrs[]){
      int n;
        System.out.println(isPrime(66));
    }
}
