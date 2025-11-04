public class problem13 {
    public static int pairs(int n){
//   base case
if(n==1 || n==2){
    return n;
}
        //choice
        // singlr
        int fnm1 = pairs(n-1);
        int fnm2 = pairs(n-2);
        int pairways = (n-1) *fnm2;
       int totalways = fnm1 + pairways ;
       return totalways;
    }
    public static void main(String args[]){
        System.out.println(pairs(3));
    }
    
}
