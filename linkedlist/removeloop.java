public class removeloop {
        
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


    public static void removeloop() {
        node slow = head;
        node fast = head;
        boolean cycle = false;
        // Detect loop using Floyd's Tortoise and Hare algorithm
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return ; // No loop found
            } 
            slow = head;
            node prev = null; // To keep track of the previous node of fast
            while(slow!=fast){
                slow = slow.next;
                prev = fast; // Update prev to the current position of fast
                fast = fast.next;
             }

             // remove cycle
             prev.next = null;
        }
                    
    public static void main(String[] args) {
        head = new node(1);
        node temp = new node(2);
        head.next = temp;
        head.next.next = new node(3);
        head.next.next.next = temp;  // Creating loop

         // Remove the loop

        System.out.println(isloop());
        removeloop(); 
        System.out.println(isloop());
        }
    }

