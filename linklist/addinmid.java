public class addinmid {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static Node head;
    public static Node tail;
    public static int size; // help to determine the size of a LL

   
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void add(int idx , int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst(){ // remove in a ll
        if(size==0){
            System.out.println("ll is empty");
        }
        else if(size ==1){
            head = tail = null;
            size = 0;
        }
        head= head.next;
        size--;
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

    public static void main(String args[]) {
        addinmid ll = new addinmid();

       
        ll.addFirst(2);
        ll.addFirst(1); 
        ll.addFirst(4);
        ll.addFirst(5);
        ll.add(2, 9);
        ll.print();

        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);

    }
}
