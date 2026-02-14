public class zigzigLL {

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail
    public static Node head;
    public static Node tail;

    // Add node at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Print list
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // ZigZag function
    public void zigzag() {

        if (head == null || head.next == null) {
            return;
        }

        // 1️⃣ Find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // 2️⃣ Reverse second half
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3️⃣ Alternate merge
        Node left = head;
        Node right = prev;

        Node nextL, nextR;

        while (left != null && right != null) {

            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String args[]) {

        zigzigLL ll = new zigzigLL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        // Before
        ll.print();

        ll.zigzag();

        // After
        ll.print();
    }
}
