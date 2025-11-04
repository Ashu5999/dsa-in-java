public class subArr {
    public static void sub(int num[]){

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                for(int k =i; k<=j; k++ ){  // print
                  System.out.print(num[k] + " "); // subarray
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String agrs[]){
        int num[] = {2,4,6,8,10};
        sub(num);
    }
    
}
  