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
    public boolean isBalanced(TreeNode root) {
        return ht(root)!=-1;
        
        
        
        // O(N^2)
//         if(root==null) return true;
//         int lh = ht(root.left);
//         int rh = ht(root.right);
//         if(Math.abs(lh-rh)>1){
//             return false;
//         }
//         boolean left = isBalanced(root.left);
//         boolean right = isBalanced(root.right);
//         if(!left || !right){
//             return false;

//         }
//         return true;
        
        
        
    }
    // static int ht(TreeNode root){
    //     if(root==null) return 0;
    //     return 1 + Math.max(ht(root.left),ht(root.right));
    // }
    
    static int ht(TreeNode root){
        if(root==null) return 0;
        int lh = ht(root.left);
        int rh = ht(root.right);
        if(lh==-1 || rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return 1+Math.max(lh,rh);
    }
}