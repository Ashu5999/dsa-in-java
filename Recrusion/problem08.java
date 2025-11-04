public class problem08 {    // another approach
    public static int lastocc(int arr[], int key , int i){
        if (i==1){  
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return lastocc(arr,key,i-1);
    }
    public static void main(String args[]){
        int arr[] = {1,3,4,5,6,7,8,8,9,7,5,5,8,8};
        int key = 5;
        int i = arr.length-1;
        System.out.println(lastocc(arr,key,i));
    } 
}

// another approach

//  public static int lastocc(int arr[],int key,int i){
//        if (i==arr.length){
//            return -1;
//        }
//        int isFound = lastocc(arr , key , i+1);
//        if(isFound == -1 && arr[i]== key){
//         return i;
//     } 
//     return isFound;     
//  }
       
 