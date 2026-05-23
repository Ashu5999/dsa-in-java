package practiceWork;
import java.util.*;
public class linearSec {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int arr[] = new int[n];
    int target = sc.nextInt();
    for(int i = 0; i<arr.length;i++){
        arr[i] = sc.nextInt();
}
for(int i = 0; i<arr.length;i++){
    if(arr[i] == target){
        System.out.println("the target is found at index " + i);
        return;
    }
}
System.out.println("the target is not found in the array");
}
}

/* 
Linear Search

Logic:
1. Traverse array from 0 to n-1.
2. Compare each element with target.
3. If match found:
   print index and stop.
4. If loop completes:
   target not found.
    */