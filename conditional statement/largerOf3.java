public class largerOf3 {
    public static void main(String args[]){
        int a = 1;
        int b = 3;
        int c = 6;

       if ((a>=b) && (a>=c) ) {
        System.out.println("a is larger among 3 ");
       }
       else if (b>=c){
        System.out.println("b is larger among 3");
       }
       else{
        System.out.println("c is larger among 3");
       }
    }
    
}
