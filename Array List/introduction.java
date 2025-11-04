import java.util.ArrayList;

public class introduction {
    public static void main(String args[]){
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList <Boolean> list3 = new ArrayList<>();
   
        list.add(1);  //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);

        System.out.println(list);
        System.out.println(list.size());

    //     // get operation O(1)
    //     int element = list.get(2);
    //     System.out.println(list);

    //     // remove element
    //      list.remove(2);
    //   System.out.println(list);

      // modify element
    //   list.set(2,10); 
    //   System.out.println(list);

    //   // cointains element
    //   System.out.println(list.contains(11));
    //   System.out.println(list.contains(1));
    }
}

