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
    public ListNode rotateRight(ListNode head, int k) {
    if(head == null || head.next == null) return head;

    ListNode temp = head;
    int n = 0;

    // count length
    while(temp != null){
        temp = temp.next;
        n++;
    }

    k = k % n;
    if(k == 0) return head;

    ListNode slow = head;

    // move to (n-k-1)th node
    for(int i = 1; i <= n - k - 1; i++){
        slow = slow.next;
    }

    ListNode newHead = slow.next;
    slow.next = null;

    // go to last node of new list
    ListNode temp1 = newHead;
    while(temp1.next != null){
        temp1 = temp1.next;
    }

    // connect
    temp1.next = head;

    return newHead;
}
}