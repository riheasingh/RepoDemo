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
        // ListNode dummy=new ListNode(-1);
        // ListNode temp=dummy;
        // int carry=0;
        // while(l1!=null ||l2!=null){
        //     int num=0;
        //     if(l1!=null)num+=l1.val;
        //     if(l2!=null) num+=l2.val;
        //    if(carry==1)num+=carry;
        //     ListNode node =new ListNode(num%10);
        //     temp.next=node;
        //     temp=temp.next;
        //     carry=num/10;
        //     if(l1!=null) l1=l1.next;
        //     if(l2!=null)l2=l2.next;
            
        // }
        // if(carry==1){
        //         ListNode node=new ListNode(1);
        //         temp.next=node;
        //         temp=temp.next; 
        //     }
        //     return dummy.next;
        ListNode dummy=new ListNode(-1);
        int carry=0;
        ListNode temp=dummy;
        while(l1!=null || l2!=null||carry!=0){
            int val1=0,val2=0;
            if(l1!=null){
                 val1=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                val2=l2.val;
                l2=l2.next;
            }
            int val=val1+val2+carry;
            temp.next=new ListNode(val%10);
            temp=temp.next;
            carry=val/10;
        }
        return dummy.next;
        
        
    }
}