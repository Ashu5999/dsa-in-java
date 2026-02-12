public class loopinll {

    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;

    public static boolean isloop() {
        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;   // Loop detected
            }
        }
        return false;  // No loop
    }

    public static void main(String[] args) {
        head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);

        head.next.next.next = head;  // Creating loop

        System.out.println(isloop());  
    }
}
