public class fucntionOverload {

  public static int sum(int a , int b) { // function to calculate a sum of 2 numbers
    return a + b;
  } 
  
  public static int sum (int a , int b, int c){ // function to calculate a sum of 3 numbers
    return  a + b + c ;
  }
   public static void main(String args[]){
 System.out.println(sum(3,5));
  System.out.println(sum(3 ,5 ,7));

   } 
    
}
