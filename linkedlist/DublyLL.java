public class DublyLL {
     
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

         // Add first
         public  void addfirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head = tail= newNode;
                return;
            }

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
         }
        // remove first 
          public void removefirst(){
           if(head== null){
            System.out.println("ll is empty");
            return;
           }

          if(head.next == null){
            head = tail = null;
            size--;
            return ;
          }
         
        head = head.next;
        head.prev = null;
        size--;
         }


        // print ll 

         public void print(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+"<->");
                temp = temp.next;
            }  
            System.out.println("null");}

            // reverse a ll
            public void reverse(){
                Node curr = head ;
               Node prev = null;
               Node next;

               while(curr!= null){
               next = curr.next ;
               curr.next = prev;
               curr.prev = next;
               prev = curr;
               curr = next ;
               }
                head = prev;
            }


    public static void main (String[] args){
     DublyLL dll = new DublyLL();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);

        dll.print();
        System.out.println(size);

        // System.out.println("after removing first");
        // dll.removefirst();
        // dll.print();.....
        // System.out.println(size);
        System.out.println("reverse a ll");
        dll.reverse();
        dll.print();
    }
}
// end of  code