package Leetcode.LinkedList;

public class SegregateOddEvenLL {
    static class Node{
        Node next;
        int data;
        Node(int data){
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

        Node seg  = segregate(head);
        while (seg!=null){
            System.out.print(seg.data + " ");
            seg = seg.next;
        }
    }
    public static Node segregate(Node head){
        Node even = head.next;
        Node odd = head;
        Node evenHead = head.next;

        while (even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

}
