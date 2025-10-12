package Leetcode.LinkedList;

public class RotateLL {
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
        Node ro = rotate(head , 2);
        while (ro!=null){
            System.out.print(ro.data + " ");
            ro = ro.next;
        }
    }
    public static Node rotate(Node head , int k){
        if(head == null){
            return head;
        }
        Node temp = head;
        int size=1;

        while (temp.next!=null){
            size++;
            temp = temp.next;
        }
        if(k%size == 0) return head;
        k = k %size;
        temp.next = head;

        int indx = size-k;
        temp = head;
        for (int i =0 ; i<indx-1;i++){
            temp = temp.next;
        }
        Node newNode = temp.next;
        temp.next = null;
        return newNode;
    }

}
