

public class problem02{

    public static void pyramid(int n){
//       outer loop 
        for(int i=1;i<=n;i++){

            // for space
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            // for star
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
             System.out.println("");
        }
    }

    public static void main(String args[]){
        pyramid(5);
    }
    
}
