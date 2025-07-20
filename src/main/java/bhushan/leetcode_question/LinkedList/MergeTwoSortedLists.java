package bhushan.leetcode_question.LinkedList;

public class MergeTwoSortedLists {
    // Definition for singly-linked list. only for reference class to avoid compilation error
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next)
        { this.val = val; this.next = next;}
      }

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode a= A;
        ListNode b= B;
        ListNode head = new ListNode(-1);
        ListNode current = head;

        while(a!=null && b!= null){
            if(a.val <= b.val){
                current.next = a;
                a= a.next;
            }else{
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }
        if(a != null){
            current.next = a;
        }
        if(b != null){
            current.next = b;
        }
        return head.next;


    }
}
