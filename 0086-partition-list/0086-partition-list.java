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
     public ListNode partition(ListNode head, int x) {
        if(head==null ||head.next==null)return head;
        ListNode Dummy1=new ListNode(-1);
        ListNode Dummy2=new ListNode(-2);
        ListNode temp=head;
        ListNode temp1=Dummy1;
        ListNode temp2=Dummy2;
        while(temp!=null){
            if(temp.val<x){
                temp1.next=temp;
                
                temp1=temp1.next;
            }
            else{
                temp2.next=temp;
               temp2=temp2.next;
            }
             temp=temp.next;
        }
        temp2.next=null;
       Dummy1=Dummy1.next;
       Dummy2=Dummy2.next;
       if(Dummy1==null)return Dummy2;
       temp1.next=Dummy2;
       return Dummy1;
       
        
    }
}