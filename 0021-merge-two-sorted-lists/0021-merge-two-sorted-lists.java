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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        ListNode temp = merged;
        ListNode t1 = list1;
        ListNode t2 = list2;
        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                ListNode newNode = new ListNode(t1.val);
                temp.next = newNode;
                t1 = t1.next;
                temp = temp.next;
            } else {
                ListNode newNode = new ListNode(t2.val);
                temp.next = newNode;
                t2 = t2.next;
                temp = temp.next;
            }
        }

        while (t1 != null) {
            ListNode newNode = new ListNode(t1.val);
            temp.next = newNode;
            t1 = t1.next;
            temp = temp.next;
        }
        while (t2 != null) {
            ListNode newNode = new ListNode(t2.val);
            temp.next = newNode;
            t2 = t2.next;
            temp = temp.next;
        }
        return merged.next;
    }
}