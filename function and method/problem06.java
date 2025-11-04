public class problem06 {
     
    public static void bintoDec(int binNum){
        int mynum = binNum;
        int pow = 0;
        int dec = 0;
        while(binNum>0){
            int lastdi = binNum % 10;
            dec = dec + (lastdi * (int)Math.pow(2,pow));
           
           pow++;
           binNum = binNum/10;
        }
        System.out.println("decimal of " + mynum + " is = " + dec);
    }

    public static void main(String args[]){
        bintoDec(111);
    }
}
