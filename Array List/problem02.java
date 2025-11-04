import java.util.*;
public class problem02 {
    public static boolean sum(ArrayList<Integer> arr, int target){
        int i = 0;
        int j = arr.size()-1;
        while(i<j){
            if(arr.get(i) + arr.get(j) == target){
            return true;
            }
            else if(arr.get(i) + arr.get(j) >target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public static void main(String args[]){
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
     arr.add(2);
     arr.add(3);
     arr.add(4);
     arr.add(5);
      arr.add(6);
   int target = 5;
   System.out.println(sum(arr,target));
    }
}
