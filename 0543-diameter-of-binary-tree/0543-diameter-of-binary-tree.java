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
//     public int diameterOfBinaryTree(TreeNode root) {
//         int[] d = new int[1];
//         ht(root,d);
//         return d[0];
//     }

//     public int ht(TreeNode root,int[] d){
//         if(root==null) return 0;
//         int l = ht(root.left,d);
//         int r= ht(root.right,d);
//         d[0] = Math.max(d[0],l+r);
//         return 1+Math.max(l,r);
//     }
    
    
    private static int findHeight(TreeNode root){
    if(root == null) return 0;
    int leftHeight = findHeight(root.left);
    int rightHeight = findHeight(root.right);
    return 1 + Math.max(leftHeight, rightHeight);
}
int dia = 0;
public int diameterOfBinaryTree(TreeNode root) {
    if(root == null) return 0;
    int leftHeight = findHeight(root.left);
    int rightHeight = findHeight(root.right);
    dia = Math.max(dia, leftHeight + rightHeight);
    diameterOfBinaryTree(root.left);
    diameterOfBinaryTree(root.right);
    return dia;
}
}