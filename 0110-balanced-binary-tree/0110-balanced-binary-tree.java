/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int  level(TreeNode root,boolean[] ans){
        if(root==null)return 0;
        int leftlevel=level(root.left,ans);
        int rightlevel=level(root.right,ans);
        int diff=Math.abs(leftlevel-rightlevel);
        if(diff>1)ans[0]=false;
        return 1+Math.max(leftlevel,rightlevel);

    }

    public boolean isBalanced(TreeNode root) {
        boolean[] ans={true};
        level(root,ans);
        return ans[0];
    }    
}
