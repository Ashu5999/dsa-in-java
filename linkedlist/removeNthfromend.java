public class removeNthfromend {
     public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }

        public static Node head;
        public static Node tail;


      public void addFirst(int data) {
        Node newNode = new Node(data);
       
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    

    
   
     public void print() {    // print a ll
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

     public int itrSearch(int  key){ // O(n)
        Node temp = head;
         // if key found
        int i = 0;
        while(temp != null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        // if key not found
        return -1;
     }
      public int helper(Node head , int key){
          if(head == null){
                return -1;
          }
            if(head.data == key){
                return 0;
            }
            int idx = helper(head.next, key);
            if(idx == -1){
                return -1;
            }
            return idx+1;
      }

     public int recSearch(int key){
        return helper(head , key);
     }

     public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;



     }

     public void removeEnd(int n){
        // determine size
        int size = 0;
        Node temp = head;
        while(temp!= null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next;  // remove first
            return;
        }

        Node prev = head;
        for(int i = 1; i<size-n; i++ ){
            prev = prev.next;
        }
        prev.next = prev.next.next;
     }
        public static void main(String args[]) {
    removeNthfromend ll = new  removeNthfromend();

       ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3); 
        ll.addFirst(2);
        ll.addFirst(1);
        
        ll.print();
         ll.removeEnd(3);
         ll.print();
       
       

    }
}
