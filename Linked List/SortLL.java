package Leetcode.LinkedList;

public class SortLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        Node ans = sort(head);
        while (ans!=null){
            System.out.print(ans.data +" ");
            ans = ans.next;
        }

    }

    public static Node middle(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node left , Node right){
        if(left == null){
            return right;
        }
        if (right == null){
            return left;
        }
        Node temp = new Node(-1);
        Node ans = temp;
        while (left!=null && right!=null){
            if(left.data < right.data){
                temp.next = left;
                temp = left;
                left = left.next;
            }
            else{
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }
        while (left!=null){
            temp.next = left;
            temp = left;
            left = left.next;
        }
        while (right!=null){
            temp.next = right;
            temp = right;
            right = right.next;
        }
        ans = ans.next;
        return ans;
    }
    public static Node sort(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node mid = middle(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = sort(left);
        right = sort(right);

        Node result = merge(left,right);
        return result;

    }
}
