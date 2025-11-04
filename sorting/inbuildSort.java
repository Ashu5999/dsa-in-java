import java.util.Arrays;
import java.util.Collections;
public class inbuildSort {

    public static void printArr(Integer arr[]) {
        for (Integer i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       
    }
    public static void main(String args[]){
        Integer arr[] = { 5 ,4,3,1,2};
        //   Arrays.sort(arr);
        Arrays.sort(arr , Collections.reverseOrder());
        printArr(arr);

    }
    
}
