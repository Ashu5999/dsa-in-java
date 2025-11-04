public class problem10 {
    public static void numPyramid(int n){
          // for  1st half
        for(int i=1; i<=n; i++){
            // space 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1; j<= i; j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

        public static void main(String args[]){
            numPyramid(5);
        
}
}
