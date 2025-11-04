public class clearIthbit {
    public static int operations(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask ;
    }
    public static void main(String args[]){
        System.out.println(operations(10,1));
    }
}

    

