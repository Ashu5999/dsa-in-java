public class mergesortLL {

   static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
   }

   static class LinkedList {
        Node head;
        Node tail;

        void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // ✅ Added print method
        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
   }

   public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
   }

   public static Node merge(Node head1, Node head2){
        Node mergedLL = new Node (-1);
        Node temp = mergedLL;

        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while(head1!= null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!= null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
   }

   public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mid = getMid(head);   
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);   
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
   }

   public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(3);

        System.out.println("Before Sorting:");
        ll.print();  

        ll.head = mergeSort(ll.head);

        System.out.println("After Sorting:");
        ll.print();   
   }
}
