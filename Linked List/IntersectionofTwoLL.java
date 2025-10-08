package Leetcode.LinkedList;

public class IntersectionofTwoLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // List B: 9 -> 10 -> 3 -> 4 -> 5
        Node headB = new Node(9);
        headB.next = new Node(10);
        headB.next.next = head.next.next; // intersection at node with data = 3

        Node intersection = intersection(head,headB);
        System.out.println(intersection.data);


    }
    public static Node intersection(Node head,Node headB){
        if (head == null || headB == null) return null;
        Node t1 = head;
        Node t2 = headB;

        while (t1!=t2){

            if (t1==null){
                t1 = headB;
            }
            if(t2==null){
                t2 =head;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
}
