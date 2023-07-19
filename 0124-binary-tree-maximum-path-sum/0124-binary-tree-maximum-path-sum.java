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
    //int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        
        int[] dp = new int[1];
        dp[0] = Integer.MIN_VALUE;
        ht(root,dp);
        return dp[0];
        
        // helper(root);
        // return max;
        
    }
    
    int ht(TreeNode root,int[] dp){
        if(root==null) return 0;
        int lh = Math.max(ht(root.left,dp),0);
        int rh = Math.max(ht(root.right,dp),0);
        dp[0] = Math.max(dp[0],root.val+lh+rh);
        return root.val+Math.max(lh,rh);
    }
    
//     int helper(TreeNode root){
//         if(root == null) return 0;

//         int left = Math.max(helper(root.left),0);
//         int right = Math.max(helper(root.right),0);

//         max = Math.max(max,root.val+left+right);
//         return root.val + Math.max(left,right);
//     }
}