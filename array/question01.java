public class question01 {
    public static boolean twiceEle(int num[]){
        for (int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }

        }
        return false;

    }

    public static void main(String args[]){
        int num[]= {1 ,2,3,4,6,8};
        System.out.println(twiceEle(num));
    }
}
