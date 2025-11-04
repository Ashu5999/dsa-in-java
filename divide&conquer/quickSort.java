public class quickSort {
    public static void arr(int arr[]){
        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

   public static void quickSort(int arr[] , int si , int ei){
    if(si>= ei){
        return;
    }
    int piv = partition(arr,  si , ei);
        quickSort(arr, si , piv-1);
        quickSort(arr, piv+1, ei);
   } 

   public static int partition(int arr[], int si , int ei ){
    int pivot = arr[ei];
    int i = si -1;  // to make a placefor smaller than pivot

    for(int j=si; j<ei;j++){
        if (arr[j]<= pivot){
            i++;
            // swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
     i++;
       
            int temp = pivot;
            arr[ei] = arr[i];
            arr[i] = temp;
         return i;

   }

   public static void main(String args[]){
    int arr[] = {3,5,8,1,0,-3,8};
    quickSort(arr,0,arr.length-1);
    arr(arr);
   }
}
