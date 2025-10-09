package Leetcode.LinkedList;

public class AddTwoNumberLL {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(3);

        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(4);

        Node temp = add(head,headB);
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static Node add(Node head,Node headB){
        int  sum =0;
        int carry = 0;

        Node l1 = head;
        Node l2 = headB;

        Node dummy = new Node(-1);
        Node curr = dummy;

        while (l1!=null || l2!=null || carry!=0){
            sum = carry;

            if(l1!=null){
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2!=null){
                sum += l2.data;
                l2 = l2.next;
            }
            carry = sum/10;
            int digit = sum % 10;
            curr.next = new Node(digit);
            curr = curr.next;

        }
        return dummy.next;

    }
}
