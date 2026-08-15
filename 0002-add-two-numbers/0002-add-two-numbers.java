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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nxtl1;    
        ListNode nxtl2;   
        ListNode head = null;
        ListNode temp = head; 
        ListNode t1 = l1;
        ListNode t2 = l2;
        int carry = 0;
        while(t1 != null && t2!= null){
            nxtl1 = t1.next;
            nxtl2 = t2.next;
            int sum = t1.val+t2.val+carry;
            carry = sum/10;
            sum = sum%10;
            ListNode newNode = new ListNode(sum);
            if(temp==null){
                temp = newNode;
                head = newNode;
            }
            else{
                temp.next = newNode;
                temp= temp.next;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        while(t1 != null){
            nxtl1 = t1.next;
            int sum = t1.val+carry;
            carry = sum/10;
            sum = sum%10;
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp= temp.next;
            t1 = t1.next;
        }
        while(t2 != null){
            nxtl2 = t2.next;
            int sum = t2.val+carry;
            carry = sum/10;
            sum = sum%10;
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp= temp.next;
            t2 = t2.next;
        }
        if(carry == 1){
            ListNode newNode = new ListNode(1);
            temp.next = newNode;
        }
        return head;
    }
}