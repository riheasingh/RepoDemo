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
    public boolean isPalindrome(ListNode head){
        ListNode temp=head;
        Stack<ListNode> st=new Stack<>();
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        
        while(!st.isEmpty()){
            if(st.pop().val!=head.val){
                return false;
                
            }
            head=head.next;
        }
        return true;
    }
}