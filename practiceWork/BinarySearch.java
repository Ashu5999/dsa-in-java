package practiceWork;
import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]== target){
                System.out.println("the target is at index " + mid);
                return;
            }
            else if(arr[mid]< target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println("the target is not found in the array");
    }
}

/* 
Binary Search

Logic:
1. Works only on sorted array.
2. Take:
   start = 0
   end = n-1
3. Find middle element.
4. If target == mid:
   element found.
5. If target > mid:
   search right half.
6. If target < mid:
   search left half.
7. Repeat until start > end.


Mid Formula
mid = start + (end-start)/2

Used to avoid integer overflow.
*/