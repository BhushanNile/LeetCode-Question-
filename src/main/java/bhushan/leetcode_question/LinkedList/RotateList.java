package bhushan.leetcode_question.LinkedList;

public class RotateList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next)
        { this.val = val; this.next = next;}
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode temp = head; int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        int effectiveK =k%length;
        if(effectiveK  == 0) return head;
        temp.next = head;
        ListNode temp2 = head;
        for(int i=0; i< length-effectiveK-1; i++){
            temp2 = temp2.next;
        }
        ListNode head2 = temp2.next;
        temp2.next = null;
        return head2;

    }
}
