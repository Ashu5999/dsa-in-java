public class GetIthbit {
    public static void operations(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask) ==0){
            System.out.println(i +"th bit is = 0");
        }
        else{
            System.out.println(i +"th bit is = 1");
        }
    }
    public static void main(String args[]){
        operations(15,3);
    }
}
