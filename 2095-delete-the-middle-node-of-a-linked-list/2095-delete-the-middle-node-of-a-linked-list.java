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
    public ListNode deleteMiddle(ListNode head) {
        // ListNode slow=head;
        // ListNode fast=head;
        // if(head.next==null) head=null;
        // else if(head.next.next==null) head.next=null;
        //  else{
        //     while(fast.next.next!=null && fast.next.next.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        //     }
        //     slow.next=slow.next.next;
        // }
        if(head.next==null)return null;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int n=count/2;
        temp=head;
        for(int i=1;i<n;i++){
           temp=temp.next;

        }
        temp.next=temp.next.next;
        
        return head;
    
    }
}