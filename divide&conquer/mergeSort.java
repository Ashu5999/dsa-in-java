 
 public class mergeSort {

    public static void  array(int arr[]){
    for(int i = 0; i< arr.length; i++){
        System.out.print(arr[i] + " ");  
    }
      }

      public static void mergeSort(int arr[], int si , int ei){
        if(si >= ei){
            return ;
        }
           int mid = si + (ei - si)/2;
           mergeSort(arr,si,mid);  // for left
           mergeSort(arr,mid+1, ei);  // for right
           merge(arr,si,ei,mid);
      }

      public static void merge(int arr[], int si, int ei, int mid){
        int temp[] = new int[ei - si +1];
        int i = si;
        int j = mid+1;
        int k =0;

        while(i<=mid && j<=ei){
           if(arr[i] < arr[j]){
            temp[k] = arr[i];
            i++;
           }
           else{
            temp[k] =  arr[j];
            j++;
        }
           k++;
        }

        while(i <= mid){
            temp[k] = arr[i];
            i++ ;
            k++;
        }

         while(j <= ei){
            temp[k] = arr[j];
            j++ ;
            k++;
        }
        for(k =0 , i=si; k< temp.length; i++,k++){
            arr[i] = temp[k];
        }
      
      }

      public static void main(String args[]){
        int arr[] = {2,4,3,6,7,43,2,5};
        mergeSort(arr,0,arr.length-1);
        array(arr);
      }
      


    
    }


