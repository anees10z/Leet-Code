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
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode even = null;
        ListNode etemp = even;
        ListNode odd = null;
        ListNode otemp = even;
        ListNode temp = head;
        int count = 1;

        while (temp != null) {
            if ((count & 1) == 0) {
                ListNode newNode = new ListNode(temp.val);
                if (even == null) {
                    even = newNode;
                    etemp = newNode;
                } else {
                    etemp.next = newNode;
                    etemp = etemp.next;
                }
            } else {
                ListNode newNode = new ListNode(temp.val);
                if (odd == null) {
                    odd = newNode;
                    otemp = newNode;
                } else {
                    otemp.next = newNode;
                    otemp = otemp.next;
                }
            }

            count++;
            temp = temp.next;
        }
        otemp.next = even;

        return odd;
    }
}