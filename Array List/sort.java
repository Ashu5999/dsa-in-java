import java.util.*;
public class sort {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(6);

        Collections.sort(list);// ascending order ny defaly
        System.out.println(list);

        // descending
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);
    }
}
