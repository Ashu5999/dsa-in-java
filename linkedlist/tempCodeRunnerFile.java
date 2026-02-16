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

         public void print(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+"<->");
                temp = temp.next;
            }  
            System.out.println("null");}


    public static void main (String[] args){
     DublyLL dll = new DublyLL();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);

        dll.print();
        System.out.println(size);

        System.out.println("after removing first");
        dll.removefirst();
        dll.print();
        System.out.println(size);
    }
}
