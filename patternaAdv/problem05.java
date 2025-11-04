

public class problem05 {
    public static void Tri(int n){
      
          // outer loop
        for(int i =1;i<=n;i++){
         // inner -- how many times a num will printed
            for(int j =1;j<= i; j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }

               
            }// line chamge
            System.out.println("");

        }
    }

    public static void main(String args[]){
        Tri(7);
    }
    
}

    

