// Implementation of Merge Sort on Singly Linked List
// Time Complexity: O(n log n)
// Space Complexity: O(log n) due to recursion stack
// Merge Sort is preferred for Linked Lists because splitting
// and merging can be done efficiently using pointers.

public class mergesortLL {

   // Node of Linked List
   static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
   }

   // Custom LinkedList class
   static class LinkedList {
        Node head;
        Node tail;

        // Add element at end
        void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Print Linked List
        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
   }

   // Find middle using Slow & Fast pointer method
   public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow will be mid
   }

   // Merge two sorted linked lists
   public static Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1); // dummy node
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Attach remaining nodes
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next; // skip dummy node
   }

   // Recursive Merge Sort
   public static Node mergeSort(Node head){
        // Base case
        if(head == null || head.next == null){
            return head;
        }

        // Step 1: Find middle
        Node mid = getMid(head);

        // Step 2: Split list into two halves
        Node rightHead = mid.next;
        mid.next = null; // break the link

        // Step 3: Recursively sort both halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Step 4: Merge sorted halves
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
