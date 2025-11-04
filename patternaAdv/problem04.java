
public class problem04 {
    
  

    public static void flyodTri(int n){
        int num = 1;
          // outer loop
        for(int i =1;i<=n;i++){
         // inner -- how many times a num will printed
            for(int j =1;j<= i; j++){
                  System.out.print(num + " ") ;
              num = num +1;

               
            }// line chamge
            System.out.println("");

        }
    }

    public static void main(String args[]){
        flyodTri(7);
    }
    
}


