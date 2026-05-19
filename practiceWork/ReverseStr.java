package practiceWork;
import java.util.*;
public class ReverseStr {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine();
    int i = 0;
    int j = str.length()-1;
    char arr[] = str.toCharArray();
     while(i<j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;

     }
     System.out.println(arr);
    }
}
