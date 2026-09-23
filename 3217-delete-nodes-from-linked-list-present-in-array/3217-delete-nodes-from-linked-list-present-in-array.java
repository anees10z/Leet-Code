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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        Set<Integer> set = new HashSet<>();
        for(int val : nums){
            set.add(val);
        }
        while(temp!=null){
            if(set.contains(temp.val) && temp == head){
                head = head.next;
                temp = head;
                continue;
            }
            if(set.contains(temp.val)){
                prev.next = temp.next;
                temp=temp.next;
                continue;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}