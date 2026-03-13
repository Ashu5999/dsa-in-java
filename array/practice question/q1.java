import java.util.*;

public class q1 {

    public static boolean distint(int num[]) {

        for(int i = 0; i < num.length - 1; i++){
            if(num[i] == num[i+1]){
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]){

        int num[] = {1,2,3,1};

        Arrays.sort(num);

        System.out.println(distint(num));
    }

}