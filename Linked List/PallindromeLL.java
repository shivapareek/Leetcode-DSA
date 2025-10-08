package Leetcode.LinkedList;

import java.util.List;

public class PallindromeLL {
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
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);


        boolean isPallindrome  = pallindrome(head);
        System.out.println(isPallindrome);
    }
    public static Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return  prev;
    }

    public static boolean pallindrome(Node head){
        Node middle = middle(head);
        Node second = reverse(middle);
        Node first = head;
        while (second!=null){
            if (first.data!=second.data){
                return false;
            }
            first = first.next;
            second = second.next;

        }
        return true;

    }

}
