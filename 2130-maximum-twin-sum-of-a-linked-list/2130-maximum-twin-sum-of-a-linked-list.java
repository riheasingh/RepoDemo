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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode a=head.next;
        ListNode newHead=reverse(a);
        a.next=head;
        head.next=null;
        return newHead;
    }
    public int pairSum(ListNode head) {
        ListNode newHead=new ListNode(head.val);
        ListNode t1=head.next;
        ListNode t2=newHead;
        while(t1!=null){
            ListNode temp=new ListNode(t1.val);
            t2.next=temp;
            t2=t2.next;
            t1=t1.next;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        count=count/2;
         t1=head;
        t2=reverse(newHead);
        int max=Integer.MIN_VALUE;
        
        while(count!=0){
            int sum=t1.val+t2.val;
            max=Math.max(max,sum);
            t1=t1.next;
            t2=t2.next;
            count--;
        }
        return max;
        
    }
}