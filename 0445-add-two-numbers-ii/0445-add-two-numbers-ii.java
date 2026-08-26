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
    public static ListNode add(Stack<Integer> s1, Stack<Integer> s2) {
        ListNode head = null;
        int carry = 0;
        while ((!s1.empty()) && (!s2.empty())) {
            int sum = s1.pop() + s2.pop() + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }
        while (!s1.empty()) {
            int sum = s1.pop() + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = head;
            head = newNode;
        }
        while (!s2.empty()) {
            int sum = s2.pop() + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = head;
            head = newNode;
        }
        if (carry != 0) {
            ListNode newNode = new ListNode(1);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while (temp1 != null) {
            s1.push(temp1.val);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            s2.push(temp2.val);
            temp2 = temp2.next;
        }
        return add(s1, s2);
    }
}