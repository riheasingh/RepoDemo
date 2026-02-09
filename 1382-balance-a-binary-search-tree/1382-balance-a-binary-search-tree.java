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
    private TreeNode helper(List<Integer> ans,int lo,int hi){
        if(lo>hi) return null ;
        int mid=lo+(hi-lo)/2;
        TreeNode root=new TreeNode(ans.get(mid));
       root.left= helper(ans,lo,mid-1);
        root.right=helper(ans,mid+1,hi);
        return root;
}
    private void inorder(TreeNode root,List<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);

    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        int n=ans.size();
       return  helper(ans,0,n-1);
        
    }
}