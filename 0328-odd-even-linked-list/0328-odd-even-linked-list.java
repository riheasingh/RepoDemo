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
       if (head == null || head.next == null) return head;

        ListNode oddHead = head; // First odd node
        ListNode evenHead = head.next; // First even node
        ListNode odd = oddHead, even = evenHead;

        while (even != null && even.next != null) {
            // Link odd nodes
            odd.next = even.next;
            odd = odd.next;

            // Link even nodes
            even.next = odd.next;
            even = even.next;
        }

        // Merge odd and even lists
        odd.next = evenHead;

        return oddHead;
        
    }
}