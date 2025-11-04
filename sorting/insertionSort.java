public class insertionSort {
    public static void insertion(int arr[]){
        for(int i =1; i<arr.length;i++){
            int curr = arr[i];
            int previ = i-1;

           while(previ>=0 && arr[previ]>curr){
            arr[previ+1] = arr[previ];
            previ--;
           } 
           // insertion
           arr[previ+1] = curr;
        }
    }
             public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
     }
    
    
    public static void main(String args[]){
        int arr[]= {5,4,1,3,2};
        insertion(arr);
        printArr(arr);
    }
}
