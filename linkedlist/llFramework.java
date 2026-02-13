
// java program of linkedlist using framework
import java.util.LinkedList;  
public class llFramework {
    
public static void main(String args[]){
    LinkedList<Integer> ll = new LinkedList<>();

      // add elements
    ll.addLast(0);
    ll.addFirst(2);
    ll.addLast(1);
   //2->0->1
    System.out.println(ll);
    // remove elements
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);
}
}
