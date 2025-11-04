import java.util.*;
public class problem03 {
    public static boolean pair(ArrayList <Integer> list, int target){
        int n = list.size();
        int bp = -1;
        for(int i = 0;i<n-1;i++){
            if(list.get(i)>list.get(i+1)){
                 bp = i;
                 break;
            }
        }
        int k = bp+1;  // left pointer
        int j = bp;   // right pointer
        while(k!=j){
            if(list.get(k) + list.get(j)== target){
                return true;
            }
            else if(list.get(k) + list.get(j) < target){
             k = (k+1)%n;
            }
            else{
                j = (n+j-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList <>();
        // 11,15 ,6 , 8 ,9 ,10 ---> sorted and rotated array
        list.add(11);
        list.add(15);
         list.add(6);
          list.add(8);
           list.add(9);
            list.add(10);
            int target = 16;
            System.out.println(pair(list,target) );
    }
}
