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
    class Pair {
        TreeNode node;
        int state;
        Pair (TreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }
    
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //  priority Queue (complete binary tree property)
        //  assigning indexes as we assign indexes in the implementatiaon of PriorityQueue
        Deque<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int maxWidth = 0;
        
        while (q.size() != 0) {
            int size = q.size();
            maxWidth = Math.max(maxWidth, Math.abs(q.peekFirst().state - q.peekLast().state) + 1);
            while (size-- > 0) {
                Pair rem = q.removeLast();
                if (rem.node.left != null) {
                    q.addFirst(new Pair(rem.node.left, 2 * rem.state + 1));
                }
                if (rem.node.right != null) {
                    q.addFirst(new Pair(rem.node.right, 2 * rem.state + 2));
                }
            }
        }
        return maxWidth;
    }
}