public class maxsub {
    
    public static void sub(int num[]){
      int currSum = 0;
      int maxsum = Integer.MIN_VALUE;


        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                 currSum= 0;
                for(int k =i; k<=j; k++ ){  
                 currSum += num[k];
            }
            System.out.println(currSum);
               if (maxsum < currSum){
                maxsum = currSum;
               }
                
            }
            System.out.println();
        }
        System.out.println("max sum = " + maxsum);
    }

    public static void main(String agrs[]){
        int num[] = {2,4,6,8,10};
        sub(num);
    }
    
}
