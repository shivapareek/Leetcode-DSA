package Leetcode.LinkedList;

public class DeleteMiddleLL {
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

        Node del = delete(head);
        while (del!=null){
            System.out.print(del.data + " ");
            del = del.next;
        }

    }
    public static Node middle(Node head){
        Node slow = head;
        Node fast = head;
        Node prev = head;

        while (fast!=null && fast.next!=null){
            prev =slow;
            slow = slow.next;
            fast = fast.next.next;

        }
        return prev;

    }
    public static Node delete(Node head){
        if (head == null || head.next == null) return null;

        Node mid = middle(head);
        mid.next = mid.next.next;
        return head;


    }
}
