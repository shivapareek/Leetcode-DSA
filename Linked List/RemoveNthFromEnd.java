package Leetcode.LinkedList;

public class RemoveNthFromEnd {
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

        Node remove = removeEnd(head,2);

        while (remove!=null){
            System.out.print(remove.data + " ");
            remove = remove.next;
        }
    }
    public static Node removeEnd(Node head,int n){
        int size =0;
        Node temp = head;
        while (temp!=null){
            temp = temp.next;
            size++;
        }
        int indx = size - n;
        temp = head;
        for (int i = 0; i < indx-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;


    }
}
