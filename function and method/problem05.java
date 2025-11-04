public class problem05 {
  // fuction 1 of prime no determination
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i =2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

// function to print a series of prime
    public static void PrimesInRange(int n){
        for(int i=2;i<=n;i++){
            if (isPrime(i)){ // this case automatically consider true
               System.out.print(i +" ");
            }
        }
    }

    public static void main(String args[]){
        PrimesInRange(16);
    }
}
