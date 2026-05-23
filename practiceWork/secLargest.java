package practiceWork;
import java.util.*;
public class secLargest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lar = Integer.MIN_VALUE;
    int slar = Integer.MIN_VALUE;
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    for(int i = 0; i<arr.length;i++){
        if(arr[i]>lar){
            slar = lar;
            lar = arr[i];
        }
        else if(arr[i] < lar && arr[i] > slar){
            slar = arr[i];
        }
    }
    if(slar == Integer.MIN_VALUE){
    System.out.println("there is no second largest element in the array");
}
else{
    System.out.println("the second largest element in the array is " + slar);
}
    }
}

/* Second Largest Logic

1. Take:
   largest
   secondLargest

2. Traverse array.

3. If current > largest:
   secondLargest = largest
   largest = current

4. Else if:
   current < largest
   AND
   current > secondLargest

   update secondLargest.

TC → O(n)
SC → O(1) */
