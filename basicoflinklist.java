public class basicoflinklist {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

    }
    public static int length(Node head){
        int count=0;
        while(head != null){
            count++;
            head =head.next;
        }
        return count;
    }
    
    public static void main(String args[]){
        Node a=new Node(5);
        Node b=new Node(56);
        Node c=new Node(5);
        Node d=new Node(6);
        Node e=new Node(8);
        Node f=new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println(b.data);

        

        Node temp = a;
        while( temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }

        System.out.println("the no of node in the given likedlist:");
        int result =length(a);
        System.out.println(result);

    }
    
}
