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
    public int pathSum(TreeNode root){
        if(root==null)return 0;
        return root.val+pathSum(root.left)+pathSum(root.right);
    }
    public int findTilt(TreeNode root) {
        if(root==null)return 0;
        int myDiff=Math.abs(pathSum(root.left)-pathSum(root.right));
        int leftDiff=findTilt(root.left);
        int rightDiff=findTilt(root.right);
        return myDiff+leftDiff+rightDiff;
    }
}