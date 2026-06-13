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
       if(head==null || head.next==null)return head;
        int count=0;
     ListNode temp2=head;
        while(temp2!=null){
            temp2=temp2.next;
            count++;
        }
        k=k%count;
    if(k==0)return head;
      ListNode temp=head;
      for(int i=1;i<=count-k-1;i++){
        temp=temp.next;
      }
      ListNode newHead=temp.next;
      temp.next=null;
      ListNode temp1=newHead;
      while(temp1.next!=null){
        temp1=temp1.next;
      }
      temp1.next=head;
      return newHead;

   
}
}