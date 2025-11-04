public class powerOf2orNot {
    public static void power(int n){
     if((n & (n-1))==0){
      System.out.println("it is a power of 2");
     }
     else{
        System.out.println("it is not a power of 2");
     }
    }
    
    public static void main(String args[]){
        power(9);
    }
}
