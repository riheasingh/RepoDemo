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
    public int level(TreeNode root,int[] maxDia){
        // if(root==null) return 0;
        // return 1+Math.max(levels(root.left),levels(root.right));
        if(root==null)return 0;
        int leftlvl=level(root.left,maxDia);
        int rightlvl=level(root.right,maxDia);
        int dia=leftlvl+rightlvl;
        maxDia[0]=Math.max(maxDia[0],dia);
        return 1+Math.max(leftlvl,rightlvl);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        // if(root==null) return 0;
        // int myDia=levels(root.left)+levels(root.right);
        // int leftDia=diameterOfBinaryTree(root.left);
        // int rightDia=diameterOfBinaryTree(root.right);
        // return Math.max(myDia,Math.max(leftDia,rightDia));

        int[] maxDia={0};
        level(root,maxDia);
        return maxDia[0];


        
    }
}