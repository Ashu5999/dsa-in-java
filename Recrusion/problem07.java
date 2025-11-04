public class problem07 {
    public static int occ(int arr[],int key ,int  i){
       if (i==arr.length-1){       // base case
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        
        return occ(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]= {8,3,6,9,5,10,4,6,5,5,5};
        int key = 5;
        int i =0;    
        System.out.println(occ(arr,key,i));
    }
}
