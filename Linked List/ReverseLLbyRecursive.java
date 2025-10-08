package Leetcode.LinkedList;

public class ReverseLLbyRecursive {
    static class Node{
        int data;
        Node next;
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

        Node rev = reverse(head);
        while (rev != null) {
            System.out.print(rev.data + " ");
            rev = rev.next;
        }
    }
    public static Node reverse(Node head){
        if(head==null || head.next == null){
            return head;
        }
        Node newHead  = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
