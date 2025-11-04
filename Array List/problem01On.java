import java.util.*;
public class problem01On {
    
    public static int Storewater(ArrayList<Integer>height ){
        int i = 0;
        int j = height.size()-1;
        int max = 0;
        while(i<j){ // O(n)
            int hei = Math.min(height.get(i),height.get(j));
            int width = j-i;
            int water = hei* width;
            max = Math.max(max,water);
            if(height.get(i)<height.get(j)){
                i++;
            }
            else {
                j--;
            }
        }
        return max;
    }

    public static void main(String args[]){
        ArrayList <Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        Storewater(height);
        System.out.print(Storewater(height));
    }
}
