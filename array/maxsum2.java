public class maxsum2 {
    

    public static void sub(int num[]){
      int currSum = 0;
      int maxsum = Integer.MIN_VALUE;
       int prefix[] = new int[num.length];
        prefix[0]= num[0];
       // calculate a prefix array
       for(int i = 1;i<prefix.length;i++){
          prefix[i]= prefix[i-1] + num[i];
       }

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                 currSum= i== 0? prefix[j] : prefix[j]-prefix[i];
                
               if (maxsum < currSum){
                maxsum = currSum;
               }
                
            }
            
        }
        System.out.println("max sum = " + maxsum);
    }

    public static void main(String agrs[]){
        int num[] = {2,4,6,8,10};
        sub(num);
    }
}
