

public class palindrome {
    public static class node{
        int data;
        node next;

        public node (int data){
            this.data= data;
            this.next=null;

        } 
    }

    public static node head;
    public static node tail;


    // slow fast approach
    public node findmid(node head){
        node slow = head;
        node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

     public void addlast(int data){
        node newNode = new node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } 
        tail.next = newNode;
        tail = newNode;
    }
    
    public boolean palindrome(){
        if(head==null || head.next==null){
            return true;
        } 
        node midnode = findmid(head);

        // reverse a secomd half
        node prev = null;
        node curr = midnode;
        node next;



        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        node right = prev;
        node left = head;
        // left and right comparsion
        while(right!=null){
            if(left.data!= right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

        }       

        public static void main(String args[]){
          palindrome ll = new palindrome();

            ll.addlast(1);
            ll.addlast(2);
            ll.addlast(2);
            ll.addlast(1);


          node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    

            System.out.println(ll.palindrome());
        }
    }



