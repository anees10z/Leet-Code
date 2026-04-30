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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode dup = head;
        if(head == null || head.next == null) return head;
        while(temp != null){
            if(dup.val == temp.val && dup!=temp){
                dup.next = temp.next;
            }else{
                dup = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}