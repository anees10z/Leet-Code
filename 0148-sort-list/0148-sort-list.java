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
    public static ListNode mid(ListNode h) {
        ListNode slow = h;
        ListNode fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode merge(ListNode ls, ListNode rs) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (ls != null && rs != null) {
            if (ls.val < rs.val) {
                temp.next = ls;
                ls = ls.next;
            } else {
                temp.next = rs;
                rs = rs.next;
            }
            temp = temp.next;
        }
        if (ls != null) {
            temp.next = ls;
        }
        if (rs != null) {
            temp.next = rs;
        }
        return dummy.next;
    }

    public static ListNode mergeSort(ListNode h) {
        if (h == null || h.next == null)
            return h;
        ListNode m = mid(h);
        ListNode rightHead = m.next;
        m.next = null;
        ListNode leftSorted = mergeSort(h);
        ListNode rightSorted = mergeSort(rightHead);
        return merge(leftSorted, rightSorted);
    }

    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
}