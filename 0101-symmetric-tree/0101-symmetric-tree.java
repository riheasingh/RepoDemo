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

    public TreeNode copy(TreeNode root) {
        if (root == null) return null;

        TreeNode node = new TreeNode(root.val);
        node.left = copy(root.left);
        node.right = copy(root.right);

        return node;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        if (root.left == null && root.right == null) return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public boolean isSame(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        if (!isSame(p.left, q.left)) return false;
        if (!isSame(p.right, q.right)) return false;

        return true;
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        TreeNode copyRoot = copy(root);   // Create copy
        invertTree(copyRoot);             // Invert the copy

        return isSame(root, copyRoot);    // Compare original with inverted copy
    }
}