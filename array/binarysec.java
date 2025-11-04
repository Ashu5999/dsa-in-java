public class binarysec{
    public static int binary(int num[], int key){
        int start = 0;
        int end = num.length-1;

        while(start<=end){
            int mid = start + (end - start )/2;
  //      comparision
            if (num[mid]== key){
                return mid;
            }

            if (num[mid]>key){  // left
                end = mid - 1;
            }
            else{                // right
                start = mid +1;
            }
        }
  return -1;

    public static void main(String agrs[]){

        int num[] = {1,2,3,4,5,6,7,8,9,10};
        int key =8 ;
        int index = binary(num,key);
        if (index==-1){
            System.out.println("no key found");
        }
        else{
            System.out.println("key is at index = " + index);
        }
    }
}

