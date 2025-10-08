package Leetcode.LinkedList;

public class CountLoopLengthLL {
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
        head.next.next.next.next.next = head.next.next;

        int loopcount  = detect(head);
        System.out.println(loopcount);


    }
    public static int detect(Node head){
        Node slow = head;
        Node fast = head;
        int count = 1;
        boolean isCycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }

        }
        if(!isCycle){
            return 0;
        }
        fast =fast.next;
        while(slow!=fast){
            fast = fast.next;
            count++;

        }


        return count;
    }
}
