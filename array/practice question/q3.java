public class q3 {
    public static int sum(int num[][]){
        int d1 = 0;
        int d2 = 0;
        for(int i = 0; i<num.length;i++){
            d1 += num[i][i];
            d2 += num[i][num.length - 1 - i];
        }
    }
}
