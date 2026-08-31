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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left=head;
        ListNode middle=head.next;
        ListNode right=head.next.next;
        int first=-1,last=-1;
        int idx=1;
        int[] arr={-1,-1};
        int minDistance=Integer.MAX_VALUE;
        while(right!=null){
            if(middle.val<left.val &&middle.val<right.val || middle.val>left.val && middle.val>right.val){
              if(first==-1) first=idx;
               if(last!=-1){
                int dist=idx-last;
                minDistance=Math.min(minDistance,dist);

            }
            
            last=idx;
            }
            idx++;
            left=left.next;
            middle=middle.next;
            right=right.next;
        }
        if(first==last)return arr;
        int maxDistance=last-first;
        arr[0]=minDistance;
        arr[1]=maxDistance;
        return arr;
        
    }
}