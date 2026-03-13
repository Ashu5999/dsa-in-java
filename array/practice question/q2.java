public class q2 {
    public static int maximum(int num[][]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            for(int j = 0; j< num[0].length;j++){
                if(num[i][j] > max){
                    max = num[i][j];
                }
            }
        }
        return max;
    }

    public static  int minimum(int num[][]){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<num.length;i++){
            for(int j = 0; j<num[0].length;j++){
                if(num[i][j]  < min){
                    min = num[i][j];
                }
            }
        }
        return min;
    }
    public static void main (String Args[]){
        int num[][] = {{1,2,3},{4,5,6},{7,8,9}};
      System.out.println("Minimum value is: " + minimum(num));
       System.out.println("Maximum value is: " + maximum(num));
       }
        
    }

