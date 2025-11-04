public class countSet {
    public static int countOn(int n){
        int count =0;
        while (n>0){
            if ((n & 1) !=0){
                count ++;
            }
            n = n>>1;
        } 
          return count;
    }
    public static void main(String args[]){
        System.out.println("the number of set is = ");
        System.out.println(countOn(10));
    }
}
