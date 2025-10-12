package Leetcode.LinkedList;

public class ReverseNodeinKGroup {
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
        Node curr = rotate(head,2);
        while (curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static Node findKNode(Node head , int k){
        Node temp = head;
        for (int i=0;i<k-1 && temp !=null;i++){
            temp = temp.next;
        }
        return temp;
    }
    public static Node reverseNode(Node head){
        Node curr = head;
        Node prev = null;
        Node nex = null;

        while (curr!=null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }
    public static Node rotate(Node head , int k){
        Node temp = head;
        Node prev = null;
        Node newNode = null;
        while (temp!=null){
            Node kthNode = findKNode(temp , k );
            if(kthNode == null){
               if(prev!=null) prev.next = temp;
                break;
            }
            newNode = kthNode.next;
            kthNode.next = null;
            Node reverseHead = reverseNode(temp);
            if(temp == head){
                head = reverseHead;
            }
            else {
                prev.next = reverseHead;
            }
            prev = temp;
            temp = newNode;

        }
        return head;
    }
}
