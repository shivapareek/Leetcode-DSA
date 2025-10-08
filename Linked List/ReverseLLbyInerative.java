package Leetcode.LinkedList;

public class ReverseLLbyInerative {
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

        Node rev  = reverse(head);
        while(rev != null){
            System.out.print(rev.data + " ");
            rev = rev.next;
        }

    }
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;


    }
}
