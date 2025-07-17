package bhushan.leetcode_question.LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {
    // Definition for singly-linked list. only for reference class to avoid compilation error
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head = new ListNode(-1);
        ListNode currentNode = head;
        int carry = 0;

        while(temp1 != null || temp2 != null || carry != 0){
            int sum =0;
            if(temp1 != null){
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if(temp2 != null){
                sum += temp2.val;
                temp2 = temp2.next;
            }
            sum+=carry;
            carry = sum/10;
            int dig= sum%10;
            currentNode.next = new ListNode(dig);
            currentNode = currentNode.next;
        }
        return head.next;
    }
}
/*
2. Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
Constraints:
The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros
*/

