public class insertlinkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        // Insertion at the end of the node
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // Insert at the beginning of the node
        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // Insert at any node
        void insertAtAnyNode(int idx, int val) {
            if (idx == 0) {
                insertAtBeginning(val);
                return;
            }

            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        // Special case for insert at 0th index
        int getAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        //deleting the node pass the index value of the node 
        void delet(int idx){
            if(idx == 0){
                head =head.next;
                
                return;
            }
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp =temp.next;
            }
            temp.next =temp.next.next;
            tail = temp;
        }
    
}

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(6);
        ll.insertAtEnd(3);
        ll.insertAtEnd(8);
        display(ll.head);

        ll.insertAtBeginning(45);
        ll.insertAtBeginning(64);
        ll.insertAtBeginning(5);
        display(ll.head);

        ll.insertAtAnyNode(2, 78);
        display(ll.head);

        ll.insertAtAnyNode(0, 8);
        ll.insertAtEnd(89);
        display(ll.head);

        ll.delet(3);
        display(ll.head);


        
    }
}
